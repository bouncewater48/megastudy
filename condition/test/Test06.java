package condition.test;

import java.util.Scanner;

// 3.조건문 : 연습문제; 고급문제
public class Test06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 과락 포함 합격 여부
//        점수 두 개를 입력받고 합격 여부를 출력하세요.
//                평균이 60점 이상이면 "합격"
//        한 과목이라도 50점 이하면 무조건 "과락"
//        평균이 60점 미만이면 "불합격"
//
//        입력 예시
//
//        점수1 : 95
//        점수2 : 48
//        출력 예시
//
//        과락

//        System.out.print("점수1 : ");
//        int score1 = scan.nextInt();
//        System.out.print("점수2 : ");
//        int score2 = scan.nextInt();
//
//        double average = (score1 + score2) / 2.0;
//
//        if(average >= 60 && score1 > 50 && score2 > 50) {
//            System.out.println("합격");
//        } else if(score1 <= 50 || score2 <= 50) {
//            System.out.println("과락");
//        } else {
//            System.out.println("합격");
//        }

//        2. 윤년 구하기 ★★★★★
//        연도를 입력받아서 윤년인지 출력하세요.
//        윤년 조건
//        4로 나누어 떨어지는 연도는 윤년이다.
//        100으로 나누어 떨어지는 연도는 윤년이 아니다.
//        400으로 나누어 떨어지는 연도는 윤년이다.
//                입력 예시
//
//          윤년 : 4년마다 한번씩 찾아오는 기간이 포함된 해
//        연도 : 2020
//        출력 예시
//
//        윤년

        System.out.println("연도 : ");
        int year = scan.nextInt();

        // 4로 나누어 떨어지는 연도 중에 100으로 나누어 떨어지는 연도를 제외 한다.
        // 4로 나누어 떨어지는 연도 중에 100으로 나누어 떨어지지 않는 연도
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");
        }

//        if(year % 400 == 0) {
//            System.out.println("윤년");
//        } else if(year % 100 == 0) {
//            System.out.println("평년");
//        } else if(year % 4 == 0) {
//            System.out.println("윤년");
//        } else {
//            System.out.println("평년");
//        }

//        if(year % 4 == 0) {
//            if(year % 100 == 10 ) {
//                if(year % 400 == 0) {
//                    System.out.println("윤년");
//                } else {
//                    System.out.println("평년");
//                }
//            } else {
//                System.out.println("윤년");
//            }
//        } else {
//            System.out.println("평년");
//        }


    }
}
