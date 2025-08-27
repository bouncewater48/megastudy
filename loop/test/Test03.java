package loop.test;

import java.util.Scanner;

// 4.반복문 : 연습문제; 종합문제
public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 합 구하기
//        수를 입력받아서 1부터 입력받은 수까지의 합을 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 45
//        출력 예시
//
//        합 : 1035

        int sum = 0;
        int base = 1;
        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();

        while (number >= base) {
            sum = sum + base;
            base++;
        }
        System.out.print("합 : " + sum);
        System.out.println();

//        2. 합과 평균 구하기
//        반복문으로 5개의 수를 입력받아서 총합과 평균을 출력하세요.
//        입력 예시
//
//        1 번째 수를 입력하세요 :
//        3
//        2 번째 수를 입력하세요 :
//        59
//        3 번째 수를 입력하세요 :
//        43
//        4 번째 수를 입력하세요 :
//        20
//        5 번째 수를 입력하세요 :
//        659
//        출력 예시
//
//        총합 : 784 평균 : 156.8

        int sum1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " 번째 수를 입력하세요 : ");
            int k = scan.nextInt();
            sum1 = sum1 + k;
        }
        System.out.println("총합 : " + sum1 + " 평균 : " + (sum1 / 5.0));

//        3. 팩토리얼
//        팩토리얼은 1부터 그 수까지의 모든 수의 곱이고 아래와 같이 표현된다.
//        5! = 1 * 2 * 3 * 4 * 5
//        7! = 1 * 2 * 3 * 4 * 5 * 6 * 7
//
//        수를 입력받고 그 수의 팩토리얼을 출력하세요.
//        입력받는 수의 최대값은 10이다.
//                입력 예시
//
//        수를 입력하세요 : 8
//        출력 예시
//
//        8! = 40320

//        int number1 = scan.nextInt();

        System.out.print("수를 입력하세요 : ");
        int sum2 = 1;
        int factorial = scan.nextInt();
        for (int i = 10; i > 0; i--) {
            System.out.println(factorial);
            sum2 *= factorial;
        }
        System.out.println(factorial + "!" + " = " + sum2);

        

    }
}
