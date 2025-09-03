package oop.test.test02;
// 클래스 : 연습문제; Class 와 메서드
public class Product {

    // 이름, 가격, 유통기한
    String name;
    int price; 
    String Expiration;

    int priceCount(int count) {
        return price * count;
        // 여기서 return price; 를 박으면 price가 변경된 상태로 다시 계산되기에 수식 그대로 리턴
    }
    
    void productInfo() {
        System.out.println("이름 : " + name + "\n가격 : " + price
                + "\n유통기한 : " + Expiration);
    }

}
