package array.test;

import java.util.Scanner;

// 7. 배열: 연습문제; 배열 고급 문제
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 위치 변경 (swap)
//                두 개의 index를 입력받아서, 해당하는 index의 값을 서로 교체해서 배열을 출력하세요.
        int[] numbers = {3, 5, 2, 10, 39};
//        입력 예시
//
//        두 개의 index를 입력하세요 : 2 4
//        출력 예시
//
//        3 5 39 10 2

        // 기존 배열 확인
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // 입력할 index 값 2개 선언
        System.out.println();
        System.out.println("두 개의 index를 입력하세요");
        System.out.println("범위는 0 ~ 4 입니다.");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        // 입력된 값 2개를 교환
        int swap = numbers[number1];
        numbers[number1] = numbers[number2];
        numbers[number2] = swap;

        // 확인
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

//        2. 셔플
//        1 ~ 10까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
//        힌트
//        rand.nextInt() 함수를 이용해서, 0번째 index의 값과 rand.nextInt()번째 index의 값을 서로 교체하면 된다.
//
//        Random rand = new Random();
//
//        for (int i = 0; i < 100; i++) {
//            int randomNumber = rand.nextInt(10);
//            // swap 구현
//        }
//        출력 예시
//
//        4 5 7 8 9 1 3 6 2 10



//        3. 없는 수 찾기
//        아래 배열에 1 ~ 9의 숫자들이 들어있는데 하나의 수가 빠져 있다.
//                빠진 수를 찾아서 출력하세요.
//        int[] numbers2 = {4, 6, 3, 8, 2, 9, 1, 5};
//
//        출력 예시
//
//        없는 수는 7입니다
//        4. 빈도수 구하기
//        1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어 있다.
//        1 ~ 5까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
//        int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1}
//
//        출력 예시
//
//        1 : 2
//        2 : 3
//        3 : 3
//        4 : 1
//        5 : 1

    }
}
