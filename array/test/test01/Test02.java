package array.test.test01;

import java.util.Scanner;

// 7. 배열 : 연습문제; 배열 응용하기
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 배열 값 변경
//        index와 값을 차례로 입력받아서, 아래 배열에 해당하는 index의 값을 바꾸고 출력하세요.
        int[] numbers = {3, 5, 2, 10, 39};
//        입력 예시
//
//        변경할 index와 값을 입력하세요 : 2 16
//        출력 예시
//
//        3 5 16 10 39

        //
        System.out.print("변경할 index와 값을 입력하세요(~4, 숫자) : ");
        int number = scan.nextInt();
        int newNumber = scan.nextInt();
//        numbers[2] = 16;

        // 한번만 입력되면 되기에 반복문 내부에 작성할 필요가 없음
        numbers[number] = newNumber;

        for (int i = 0; i < numbers.length; i++) {
//            numbers[number] = newNumber;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//        2. 점수 채점
//        아래와 같이 O와 X로 채점 결과가 저장된 배열이 있다.
//        100점 만점 기준으로 몇 점을 맞았는지 출력하세요.
        char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//        출력 예시
//
//        채점 결과는 60점입니다.

        int total = 0;

        for (int i = 0; i < scores.length; i++) {
            // 만약 scores 배열에 저장된 값이 O라면
            if (scores[i] == 'O') {
                // total에 10씩 더한다
                total += 10;
            }
        }
        System.out.println("채점 결과는 " + total + "점입니다.");

//        3. 임금 계산
//        아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
//                시급 기준이 아래와 같을 때 7일 동안 일한 총 임금을 출력하세요.
//        평일 시급 : 8500원
//        주말(토, 일) 시급 : 9500원
//
        int[] works = {3, 5, 5, 3, 5, 3, 5};
//
//        출력 예시
//
//        일주일간 총 임금은 254500원입니다.

        int weekdaysPay = 8500;
        int weekendPay = 9500;
        int totalPay = 0;
        for (int i = 0; i < works.length; i++) {
            if (i <= 4) {
//                weekdays += 8500;
                totalPay += works[i] * weekdaysPay;
            } else {
                totalPay += works[i] * weekendPay;
            }
            // totalPay에 누적해서 값이 더해지기에 굳이 변수를 2개 만들 필요가 없다!

        }
        System.out.println("일주일간 총 임금은 " + totalPay + "원입니다.");

//        4. 배열 값 입력
//        길이가 5인 int 배열을 만든다.
//                수를 무한 루프로 입력받으면서, 입력받은 수가 짝수일 때만 배열에 저장한다.
//                배열이 가득 차면 입력을 중단하고, 저장된 수들을 출력한다.
//        입력 예시
//
//        수를 입력하세요 : 34
//        수를 입력하세요 : 65
//        수를 입력하세요 : 23
//        수를 입력하세요 : 74
//        수를 입력하세요 : 2
//        수를 입력하세요 : 74
//        수를 입력하세요 : 57
//        수를 입력하세요 : 68
//        출력 예시
//
//        34 74 2 74 68

        int[] array = new int[5];
        int count = 0;

        for (int i = 0; i < array.length; ) {
            // 매 루프마다 입력이 들어가야하므로 스캐너도 반복문 내부에 작성한다
            System.out.print("수를 입력하세요 : ");
            int evenNumber = scan.nextInt(); //짝수 선언
            if (evenNumber % 2 == 0) {
                array[i] = evenNumber;
                i++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
//            System.out.print("index에 저장된 값은 " + array[i] + " 입니다");
        }

    }
}
