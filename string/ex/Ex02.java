package string.ex;
// 문자열; 2
public class Ex02 {
    public static void main(String[] args) {

        // 숫자가 저장된 문자열
        String numberString1 = "30";
        String numberString2 = "20";
        // 사람에게는 누가봐도 숫자로 보이지만
        // 자바 입장에서는 ""로 묶여있어서 문자열로 취급함

        System.out.println(numberString1 + numberString2); // 3020

        // 문자열 -> 정수타입 변환
//        Integer.parseInt(); // 문자열을 정수로 바꿔주는 기능
        int number1 = Integer.parseInt(numberString1);
        int number2 = Integer.parseInt(numberString2);

        System.out.println(number1 + number2); // 50

        // 정수 -> 문자열 변환
        int number3 = 100;
        int number4 = 200;

//        String.valueOf(); //인자로 변환하고싶은 정수를 대입
        String numberString3 = String.valueOf(number3);
        String numberString4 = String.valueOf(number4);

        System.out.println(numberString3 + numberString4); // 100200

        String numberString5 = number3 + "";
        String numberString6 = number4 + "";

        System.out.println(numberString5 + numberString6); // 100200

        // 문자열 비교
        String word1 = "고양이";
        String word2 = "고양이";

        if(word1 == word2) {
            System.out.println("두 단어는 같다!!");
        }

        if(word1 == "고양이") {
            System.out.println("두 단어는 같다2222");
        }

        String word3 = new String("고양이");

        System.out.println(word3);

        if(word1 == word3) {
            System.out.println("두 단어는 같다3333");
        } else {
            System.out.println("두 단어는 다르다3333");
        }

        if(word1.equals(word3)) { // word1과 word3가 같다면 true, 다르다면 false
            System.out.println("두 단어는 같다4444");
        }

    }
}
