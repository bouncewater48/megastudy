package loop.test;

import java.util.Scanner;

// 4.반복문 : 연습문제; for문
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 반복 출력
//        35 ~ 40까지 출력하세요.
//        출력 예시
//
//        35 36 37 38 39 40

        for (int i = 35; i <= 40; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        2. 반복 출력
//        5 ~ -5까지 출력하세요.
//        출력 예시
//
//        5 4 3 2 1 0 -1 -2 -3 -4 -5

        for (int i = 5; i >= -5; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

//        3. 특정 조건 구하기
//        1 ~ 50 사이에 3의 배수만 출력하세요.
//                출력 예시
//
//        3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48

        for (int i = 3; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//            4. 갯수 세기
//            1 ~ 100 사이에 7의 배수 개수를 구하세요.
//            출력 예시
//
//            7의 배수의 개수는 : 14

        int count = 0;

        for (int i = 7; i <= 100; i++) {
            if (i % 7 == 0) {
                count++;
//                System.out.print(i + " ");
            }

        }
        System.out.print("7의 배수의 개수는 : " + count);
        System.out.println();

//        5. 구구단
//        수를 입력받아서 해당하는 단수의 구구단을 출력하세요.
//        입력 예시
//
//        단수를 입력하세요 : 8
//        출력 예시
//
//        8 X 1 = 8
//        8 X 2 = 16
//        8 X 3 = 24
//        8 X 4 = 32
//        8 X 5 = 40
//        8 X 6 = 48
//        8 X 7 = 56
//        8 X 8 = 64
//        8 X 9 = 72

        System.out.print("단수를 입력하세요 : ");
        int dan = scan.nextInt();
//        int count1 = 1;
        for (int i = 1; i < 10; i++) {
            // 8의 단수 구하기
            System.out.println(dan + " X " + i + " = " + (dan * i));
        }

//        6. 가장 큰 수
//        for를 이용해서 5개의 수를 입력받고 제일 큰 수를 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 5
//        수를 입력하세요 : 78
//        수를 입력하세요 : 3
//        수를 입력하세요 : 7
//        수를 입력하세요 : 3
//        출력 예시
//
//        가장 큰 수 : 78

//        int max = 0;
//        for(int i = 0; i < 4; i++){
//            System.out.println("수를 입력하세요 : ");
//            i1 = scan.nextInt();
//            i2 = scan.nextInt();
//            i3 = scan.nextInt();
//            i4 = scan.nextInt();
//            for()
//        }

//        int max = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("수를 입력하세요 : ");
            int k = scan.nextInt();
            if (k > max) max = k;
        }

        System.out.println("가장 큰 수 : " + max);


//        System.out.print("수를 입력하세요 : ");
//        int number1 = scan.nextInt();
//        System.out.print("수를 입력하세요 : ");
//        int number2 = scan.nextInt();
//        System.out.print("수를 입력하세요 : ");
//        int number3 = scan.nextInt();
//        System.out.print("수를 입력하세요 : ");
//        int number4 = scan.nextInt();
//        System.out.print("수를 입력하세요 : ");
//        int number5 = scan.nextInt();
//        for (int i = 0; i < 1; i++) {
//            if (number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5) {
//                System.out.println("가장 큰 수 : " + number1);
//            } else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5) {
//                System.out.println("가장 큰 수 : " + number2);
//            } else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5) {
//                System.out.println("가장 큰 수 : " + number3);
//            } else if (number4 > number1 && number4 > number2 && number4 > number3 && number2 > number5) {
//                System.out.println("가장 큰 수 : " + number4);
//            } else if (number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4) {
//                System.out.println("가장 큰 수 : " + number5);
//            } else {
//                System.out.println();
//            }
//        }
    }
}