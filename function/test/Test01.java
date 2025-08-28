package function.test;

import java.util.Scanner;

/// 6. 함수 : 연습 문제; 함수 만들기
public class Test01 {
//           1. 정수를 전달받고 2제곱의 결과를 돌려주는 함수를 만드세요.
    public static int getSquared(int a){
//        int number1 = scan.nextInt();
//        int result = number1 + number2;
//        int result = 0;
        return a * a;
//        Math.sqrt();
    }

    //       2. 4개의 값을 받아서 평균을 돌려주는 함수를 만드세요.
    public static double getAverage(int number2, int number3, int number4, int number5){
       double average =  (number2 + number3 + number4 + number5) / 4.0;

       return average;
    }

    //       3. 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
    public static void printQuotientRemainder(int number1, int number2) {
        System.out.println("몫 : " + (number1 / number2));
        System.out.println("나머지 : " + (number1 % number2));
    }

    //       4. 정수를 입력받아서 짝수면 0, 홀수면 1을 돌려주는 함수를 만드세요.
    public static int getEvenOdd(int number) {
        return number % 2;
//        int result = 0;
//        if(number % 2 == 0) {
//            return 0;
//        } else {
//            return 1;
//        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 2의 제곱 함수
//        정수를 전달받고 2제곱의 결과를 돌려주는 함수를 만드세요.
//                제곱을 구할 수를 입력받고, 함수 호출을 통해서 구한 결과를 출력하세요.
//                hint) 함수 원형 - public static int getSquared(int x)
//
//        입력 예시
//
//        제곱값을 구할 숫자를 입력하세요: 5
//        출력 예시
//
//        5의 제곱은 25이다.

        System.out.print("제곱을 구할 숫자를 입력하세요 : ");
        int number1 = scan.nextInt();

        int result1 = getSquared(number1);

        System.out.println(number1 + "의 제곱은 " + result1 + "이다.");



//        2. 평균 구하기 함수
//        4개의 값을 받아서 평균을 돌려주는 함수를 만드세요.
//        4개의 점수를 입력받고, 함수 호출을 통해서 평균을 구한 결과를 출력하세요.
//        hint) 함수 원형 - public static double getAverage(int number1, int number2, int number3, int number4)
//
//        입력 예시
//
//        점수를 입력하세요: 85 72 65 99
//        출력 예시
//
//        평균은 80.25

        System.out.println("점수를 입력하세요 : ");
        int score1 = scan.nextInt();
        int score2 = scan.nextInt();
        int score3 = scan.nextInt();
        int score4 = scan.nextInt();

        double average = getAverage(score1, score2, score3, score4);

        System.out.println("평균은 " + average);

//        3. 몫과 나머지 출력 함수
//        두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
//        함수를 호출해서 입력받은 값들의 몫과 나머지를 출력하세요.
//                hint) 함수 원형 - public static void printQuotientRemainder(int number1, int number2)
//
//        입력 예시
//
//        숫자와 나눌 수를 입력하세요: 20 7
//        출력 예시
//
//        몫: 2
//        나머지: 6

        System.out.print("숫자와 나눌 수를 입력하세요 : ");

        printQuotientRemainder(scan.nextInt(), scan.nextInt());

//        int number2 = scan.nextInt();
//        int number3 = scan.nextInt();
//
//        printQuotientRemainder(number1, number2);

//        4. 홀짝 함수
//        정수를 입력받아서 짝수면 0, 홀수면 1을 돌려주는 함수를 만드세요.
//        수를 입력받고, 함수를 이용해 입력받은 수가 짝수면 0, 홀수면 1을 출력하세요.
//        입력 예시
//
//        숫자를 입력하세요: 6
//        출력 예시
//
//        0

        System.out.print("숫자를 입력하세요 : ");
        int number = scan.nextInt();

        System.out.println(getEvenOdd(number));

    }
}
