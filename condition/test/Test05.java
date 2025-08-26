package condition.test;

import java.util.Scanner;

// 3. 조건문 : 연습문제 4; 종합 문제
public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 짝수 구하기
//        세 개의 수를 입력받아서 짝수일 때만 그 값을 출력하세요.
//                입력 예시
//
//        세 개의 수를 입력하세요 : 4 6 9
//        출력 예시
//
//        4은(는) 짝수입니다.
//        6은(는) 짝수입니다.

//        System.out.print("세 개의 수를 입력하세요 : ");
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        int number3 = scan.nextInt();
//
//        if(number1 % 2 == 0) {
//            System.out.println(number1 + "은(는) 짝수입니다." );
//        }
//        if(number2 % 2 == 0) {
//            System.out.println(number2 + "은(는) 짝수입니다.");
//        }
//        if(number3 % 2 == 0) {
//            System.out.println(number3 + "은(는) 짝수입니다.");
//        }

//        2. 비만도 구하기
//        BMI 수치를 입력받아서 비만 판정을 출력하세요.
//        BMI 수치	비만도
//        ~ 10 이하	정상
//        ~ 20 이하	과체중
//        20 초과	비만
//        입력 예시
//
//        BMI 수치를 입력하세요 : 18
//        출력 예시
//
//        18은(는) 과체중입니다.

//        System.out.print("BMI 수치를 입력하세요 : \n" + BMI);
//        int BMI = scan.nextInt();
//        
//        if(BMI <= -10) {
//            System.out.println("은(는) 정상입니다.");
//        } else if(BMI <= -20) {
//            System.out.println("은(는) 과체중입니다.");
//        } else if(BMI > 20) {
//            System.out.println("은(는) 비만입니다.");
//        }


//        4. 큰값 구하기
//        세 개의 정수를 입력받아 가장 큰 값을 출력하세요.
//        입력 예시
//
//        세 수를 입력하세요 : 3 8 5
//        출력 예시
//
//        8은(는) 가장 큰 값입니다.

//        System.out.print("세 개의 수를 입력하세요 : ");
//        int number4 = scan.nextInt();
//        int number5 = scan.nextInt();
//        int number6 = scan.nextInt();

        // 경연
        // 역도경기
        // 최고기록 : 130
        // 100 120 110 130 120

//        int max = 0;
//
//        if(number4 > max) {
//            max = number4;
//        }
//
//        if(number5 > max) {
//            max = number5;
//        }
//
//        if(number6 > max) {
//            max = number6;
//        }
//
//        System.out.println(max + "은(는) 가장 큰 값입니다.");

//        if(number4 >= number5 && number4 >= number6) {
//            System.out.println(number4 + "은(는) 가장 큰 값입니다.");
//        } else if(number5 >= number4 && number5 >= number6) {
//            System.out.println(number5 + "은(는) 가장 큰 값입니다.");                    
//        } else {
//            System.out.println(number6 + "은(는) 가장 큰 값입니다.");
//        }

//        5. 계절 구하기
//        월(month)을 입력받아서 어떤 계절인지 출력하세요.
//                월	계절
//        3, 4, 5	봄
//        6, 7, 8	여름
//        9, 10, 11	가을
//        12, 1, 2	겨울
//        입력 예시
//
//        월을 입력하세요 : 5
//        출력 예시
//
//        5월은(는) 봄입니다.

        System.out.print("월을 입력하세요 : ");
        int month = scan.nextInt();
        String season = "";

        switch (month) {
            case 3:
                season = "봄";
            case 4:
                season = "봄";
            case 5:
                season = "봄";
                break;
            case 6:
                season = "여름";
            case 7:
                season = "여름";
            case 8:
                season = "여름";
                break;
            case 9:
                season = "가을";
            case 10:
                season = "가을";
            case 11:
                season = "가을";
                break;
            case 12:
                season = "겨울";
            case 1:
                season = "겨울";
            case 2:
                season = "겨울";
        }
        System.out.println(month + "월은(는) " + season + "입니다.");

    }
}
