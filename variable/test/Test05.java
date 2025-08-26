package variable.test;

import java.util.Scanner;
// 변수 - 고급문제
public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        * 1. 자릿수 쪼개기
        네 자릿수 숫자를 입력받아서 천의 자리부터 한 줄씩 출력하세요.
        입력 예시

        입력
        1234
        출력 예시

        1
        2
        3
        4
        * */
//        int number1 = scan.nextInt();

        int number  = 3284;

        System.out.println(number / 1000);
        number = number % 1000;

        System.out.println(number / 100);
        number = number % 100;

        System.out.println(number / 10);
        number = number % 10;

        System.out.println(number / 1);
        number = number % 1;
//        System.out.println();
//        System.out.println(number / 1);

        /*
        2. 자릿수 쪼개기 역순
        네 자릿수를 입력받아서 일의 자리부터 한 줄씩 출력하세요.
        입력 예시

        입력
        1234
        출력 예시

        4
        3
        2
        1
        */

        int number2 = 4592;

        System.out.println(number2 % 10);
        number2 = number2 / 10;
        // 459
        System.out.println(number2 % 10);
        number2 = number2 / 10;
        // 45
        System.out.println(number2 % 10);
        number2 = number2 / 10;
        // 4
        System.out.println(number2);

        /*
        3. 자릿수 합 구하기
        네 자릿수를 입력받아서 각 자릿수의 합을 출력하세요.
        입력 예시

        입력
        1234
        출력 예시

        합계는 10입니다.
        */

//        System.out.println("입력");
//        int number = scan.nextInt();
//        int number1 = 7895;
//        System.out.println(number);
//
//        System.out.println(number1 / 1000);
//        number2 = number1 % 1000;
//        System.out.println(number2 / 100);
//        number3 = number2 % 100;
//        System.out.println(number3 / 10);
//        number4 = number3 % 10;
//        System.out.println(number4 / 1);
//        number = number4 % 1;
//
//        System.out.println("합계는 " + number + "입니다");

        /*
        4. 역순 출력
        세 자리 수를 입력받아서 역순으로 출력하세요.
        입력 예시

        입력 : 123
        출력 예시

        출력 : 321
* */
    }
}
