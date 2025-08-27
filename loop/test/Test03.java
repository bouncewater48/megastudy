package loop.test;

import java.util.Scanner;

// 4.반복문 : 연습문제; 종합문제
public class Test03 {
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

//        int sum = 0;
//        int base = 1;
//        System.out.print("수를 입력하세요 : ");
//        int number = scan.nextInt();
//
//        while (number >= base) {
//            sum = sum + base;
//            base++;
//        }
//        System.out.print("합 : " + sum);
//        System.out.println();

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

//        int sum1 = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i + " 번째 수를 입력하세요 : ");
//            int k = scan.nextInt();
//            sum1 = sum1 + k;
//        }
//        System.out.println("총합 : " + sum1 + " 평균 : " + (sum1 / 5.0));

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

//        System.out.print("수를 입력하세요 : ");
//        int sum2 = scan.nextInt();
//
//        if(sum2 > 0 || sum2 < 10){
//            int result = 1;
//            for (int i = 1; i <= sum2; i++) {
//                result *= i; // result = result * i;
//            }
//            System.out.println(sum2 + "! = " + result);
//        }

//        4. 최소값
//        반복문으로 5개의 수를 입력받아서 최소값을 출력하세요.
//                입력값의 최대값은 1000입니다.
//                입력 예시
//
//        1 번째 수를 입력하세요 :
//        4
//        2 번째 수를 입력하세요 :
//        29
//        3 번째 수를 입력하세요 :
//        9
//        4 번째 수를 입력하세요 :
//        398
//        5 번째 수를 입력하세요 :
//        -4
//        출력 예시
//
//        최소값은 -4입니다.

        // 최대값 선언
//        int min = 1000;

        // 첫번째로 입력한 값을 최대값으로 설정 (첫번째 입력값으로 초기화 값 설정)
//        System.out.println("1번째 수를 입력하세요 : ");
//        int min = scan.nextInt();
//        for(int i = 2; i <= 5; i++) {
//            System.out.println(i + "번째 수를 입력하세요 : ");
//            int number = scan.nextInt();
//
//            if(number < min) {
//                min = number; // min에 현재 number값 저장
//            }
//        }
//
//        System.out.println("최소값은 " + min + "입니다.");

//        5. 약수 구하기
//        수를 입력받아서 그 수의 약수를 모두 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 24
//        출력 예시
//
//        1 2 3 4 6 8 12 24

        System.out.println("수를 입력하세요 : ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { // % i == 0 : i로 나누었을때 나누어 떨어지는 수, 즉 약수를 나타냄
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
}
