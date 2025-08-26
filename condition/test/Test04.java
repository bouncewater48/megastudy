package condition.test;

import java.util.Scanner;

// 3.조건문 : 연습문제 4; switch 문
public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        요일 구하기
//        1일이 수요일일 때, 1 ~ 7일 사이의 날짜를 입력받고 해당 요일을 출력하세요.
//                입력 예시
//
//        1 ~ 7 사이의 날짜를 입력하세요 : 5
//        출력 예시
//
//        일요일

        System.out.print("1 ~ 7 사이의 날짜를 입력하세요 : ");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("수요일");
        } else if (day == 2) {
            System.out.println("목요일");
        } else if (day == 3) {
            System.out.println("금요일");
        } else if (day == 4) {
            System.out.println("토요일");
        } else if (day == 5) {
            System.out.println("일요일");
        } else if (day == 6) {
            System.out.println("월요일");
        } else if (day == 7) {
            System.out.println("화요일");
        }


    }
}
