package loop.test;

import java.util.Scanner;

// 4.반복문 : 연습문제; while문
public class Test01 {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
//        1. 반복 출력
//        수를 입력받아서 그 수만큼 "응 아니야"를 출력하세요.
//        입력 예시
//
//        횟수를 입력하세요 : 5
//        출력 예시
//
//        응 아니야
//        응 아니야
//        응 아니야
//        응 아니야
//        응 아니야

        System.out.print("횟수를 입력하세요 : ");
        int count1 = scan.nextInt();
        int i = 0;
        while(i < count1){
            System.out.println("응 아니야");
            i++;
        }

//        2. 카운트 다운 "발사"
//        수를 입력받고 그 수에서부터 0까지 한 줄씩 카운트 다운을 출력하고, 마지막에 "발사"를 출력하세요.
//        입력 예시
//
//        카운트 다운 입력하세요 : 3
//        출력 예시
//
//        3
//        2
//        1
//        0
//        발사

        System.out.print("카운트 다운을 입력하세요 : ");
        int count = scan.nextInt();
        while(count > 0 ) {
            System.out.println(count);
            count--;
        }
        System.out.println("발사");

//        3. 짝수 합 구하기
//        수를 입력받고 1에서부터 입력한 수까지의 짝수의 합을 구하여 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 12
//        출력 예시
//
//        더한 결과 : 42

        
        // 짝수로 합 구해지는것 추가하기
        int k = 1; // 고정값
//        int j = 5; // 변수
        int sum = 0;
        System.out.print("수를 입력하세요 : ");
        int j = scan.nextInt(); // 변수

        while(j >= k) {
            if(k % 2 == 0){
                sum = sum + k;
            }
            k++;

//            System.out.println(k);
        }
        System.out.println("짝수만 더한 결과 : " + sum);

//        for(int k = 1; k <= 5; k++){
//            sum += k;
//        }
//        System.out.println(sum);

//        4. 구구단
//        구구단 2단을 출력하세요.
//        출력 예시
//
//        2 X 1 = 2
//        2 X 2 = 4
//        2 X 3 = 6
//        2 X 4 = 8
//        2 X 5 = 10
//        2 X 6 = 12
//        2 X 7 = 14
//        2 X 8 = 16
//        2 X 9 = 18

        System.out.print("단을 입력하세요 : ");
        int dan = scan.nextInt();
        int l = 0;
        while(l < 9){
            l++;
            System.out.println(dan + " X " + l + " = " + (dan * l));
        }
//        System.out.println(dan + " X " + l + " = " + (dan * l));

//        5. 반복 입력
//        while을 이용하여 5번 동안 수를 입력받고 출력하세요.
//                입출력 예시
//
//        입력 : 4
//        출력 : 4
//        입력 : 5
//        출력 : 5
//        입력 : 6
//        출력 : 6
//        입력 : 7
//        출력 : 7
//        입력 : 8
//        출력 : 8

        int a = 0;
        while( a < 5) {
            System.out.print("입력 : ");
            int number1 = scan.nextInt();
            System.out.println("출력 : " + number1);
            a++;
        }

        // 입력한 숫자 그대로 출력되게 할것
//        System.out.println("반복할 수를 입력하세요 : ");
//        int number1 = scan.nextInt();
//        int number2 = scan.nextInt();
//        int number3 = scan.nextInt();
//        int number4 = scan.nextInt();
//        int count2 = 0;
//
//        while(count2 <= 3){
//            System.out.println("입력 : " + number1 + "\n출력 : " + number1 +
//                            "\n입력 : " + number2 + "\n출력 : " + number2 +
//                            "\n입력 : " + number3 + "\n출력 : " + number3 +
//                            "\n입력 : " + number4 + "\n출력 : " + number4
//                    );
//            count2++;
//        }

    }
}
