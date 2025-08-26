package condition.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 두 점수 합격
//        두 개의 점수를 입력받아서 두 점수 모두가 70점 이상이면 합격입니다를 출력하세요.
//        입력 예시
//
//        두 점수를 입력하세요 : 87 73
//        출력 예시
//
//        합격입니다.

        /*System.out.print("두 점수를 입력하세요 : ");
        int score1 = scan.nextInt();
//        System.out.print(num1 + " ");
        int score2 = scan.nextInt();
//        System.out.print(num2);

        if(score1 >= 70 && score2 >= 70){
            System.out.println("합격입니다");
        }
        
        // 둘 중에 한 점수라도 70점 미만이면 불합격
        // 만약 score1이 70점 미만이거나 score2가 70점 미만이라면 불합격
        if(score1 < 70 || score2 < 70) {
            System.out.println("불합격입니다.");
        }*/

//        2. 공배수 구하기
//        수를 입력받아서 2와 3의 공배수인지 판별하세요.
//                입력 예시
//
//        수를 입력하세요 : 12
//        출력 예시
//
//        12는 2와 3의 공배수입니다.

        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();

        if (number % 6 == 0) {
            System.out.println(number + "는(은) 2와 3의 공배수입니다.");
        }

//        if(number % 2 == 0 && number % 3 == 0) {
//            System.out.println(number + "는 2와 3의 공배수입니다.");
//        }
//
//        if(number % 2 != 0 || number % 3 != 0) {
//            System.out.println(number + "는 2와 3의 공배수가 아닙니다.");
//        }

//        3. 범위
//        1 ~ 10 사이의 수를 입력받아야 한다. 범위를 넘어갈 경우 잘못 입력하셨습니다를 출력하세요.
//        입력 예시
//
//        1 ~ 10 사이의 수를 입력하세요 : 14
//        출력 예시
//
//        잘못 입력하셨습니다.

        System.out.println("1 ~ 10 사이의 수를 입력하세요 : ");
        int num4 = scan.nextInt();

        // 1보다 작다 또는 10보다 크다
        if (num4 > 10 || num4 < 1) {
            System.out.println("잘못 입력하셨습니다.");
        }


    }
}
