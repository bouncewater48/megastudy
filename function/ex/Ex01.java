package function.ex;
// 6. 함수
public class Ex01 {
    public static void main(String[] args) {

        // 반올림
        double number = 3.65;

    // ↓ 함수 사용법 ↓
        // 함수 이름
        // 인자 : argument
        // return type
        long result = Math.round(number); // Math.round() : 반올림 함수, int(정수) 타입이 아닌 long타입으로 리턴하기에 long으로 변수 저장해야함!

        // return 이 없는 함수
        System.out.println(result);
        System.out.println(Math.round(39.7)); // 함수 자체를 변수로 사용하여 sout에 넣을 수도 있다

        // 큰 값 구하기
        int number1 = 100;
        int number2 = 200;

        System.out.println(Math.max(number1, number2));

        double sqrt = Math.sqrt(81);
        System.out.println(sqrt);


    }
}
