package design.test.test01;

// 클래스 : 연습문제; Class 와 메서드
public class Product {

    // 이름, 가격, 유통기한
    private String name;
    private int price;
    private String expirationDate;

    public void priceCount(String name, int price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public int calculatePrice(int count) {
        return price * count;
    }

    public boolean availableSell(String date) {
//        2021-03-02
//        2025-09-04

        // 앞에 것이 더 크다 (1) 양수
        // 같다 (0)
        // 뒤에 것이 더 크다 (-1) 음수

        return expirationDate.compareTo(date) >= 0;

//        if (expirationDate.compareTo(date) >= 0) {
//            return true;
//        } else {
//            return false;
//        }

//        int expirationInt = Integer.parseInt(expirationDate.replace("-", ""));
//        int dateInt = Integer.parseInt(date.replace("-", ""));
//
//        if(expirationInt >= dateInt) {
//            return true;
//        } else {
//            return false;
//        }


//        String[] expirationArray =  expirationDate.split("-");
//        int exYear = Integer.parseInt(expirationArray[0]);
//        int exMonth = Integer.parseInt(expirationArray[1]);
//        int exDay = Integer.parseInt(expirationArray[2]);
//
//        String[] dateArray = date.split("-");
//        int year = Integer.parseInt(dateArray[0]);
//        int month = Integer.parseInt(dateArray[1]);
//        int day = Integer.parseInt(dateArray[2]);
//
//        if(exYear > year){
//            return true;
//        } else if(exYear == year && exMonth > month) {
//            return true;
//        } else if(exYear == year && exMonth == month && exDay >= day) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void productInfo(String name, int price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        System.out.println("이름 : " + name + "\n가격 : " + price
                + "\n유통기한 : " + expirationDate);
    }
}
