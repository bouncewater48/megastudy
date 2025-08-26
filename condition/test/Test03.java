package condition.test;

import java.util.Scanner;

// 조건문 : 연습문제 - 3; if, else-if
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1. 음수 양수 판별
//        정수를 입력받고 음수인지 양수인지 출력하세요.
//                입력 예시
//
//        정수를 입력하세요 : -5
//        출력 예시
//
//        음수입니다.

        System.out.print("정수를 입력하세요 : ");
        int number1 = scan.nextInt();

        if (number1 > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

//        2. 학점 출력
//        점수를 입력받고 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 외는 F를 출력하세요.
//                입력 예시
//
//        점수를 입력하세요 : 86
//        출력 예시
//
//        B

        System.out.print("점수를 입력하세요 : ");
        int score = scan.nextInt();


        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
