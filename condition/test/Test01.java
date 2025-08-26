package condition.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        1. 수 비교
//        수를 하나 입력받아서 10보다 큰 수인지 작은 수인지 출력하세요.
//        입력 예시
//
//        수를 입력하세요 : 8
//        출력 예시
//
//        8은(는) 10보다 작습니다.

        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();
        System.out.println(number);

        if(number > 10){
            System.out.println(number + "은(는) 10보다 큰 수 입니다!");
        }

        if(number < 10){
            System.out.println(number + "은(는) 10보다 작은 수 입니다!");
        }

        if (number == 10) {
            System.out.println(number + "은(는) 10과 같은 수 입니다!");
        }

//        2. 수 비교
//        두 수 a, b를 입력받아서 a가 클 경우 >를, b가 클 경우 <를, 같을 경우 ==를 출력하세요.
//                입력 예시
//
//        두 개의 수를 입력하세요 : 43 22
//        출력 예시
//        >

        System.out.print("두 개의 수를 입력하세요 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + " " + b);

        if(a > b){
            System.out.println(">");
        }

        if(a < b){
            System.out.println(">");
        }

        if(a == b){
            System.out.println("==");
        }

//        3. 시험 합격
//        70점 이상이면 합격하는 시험에서 점수를 입력받아서 합격 여부를 출력하세요.
//                입력 예시
//
//        성적을 입력하세요 : 86
//        출력 예시
//
//        합격입니다.

        System.out.print("성적을 입력하세요 : ");
        int score = scan.nextInt();
        System.out.println(score);

        if(score >= 70){
            System.out.println("합격입니다.");
        }

        if(score < 70){
            System.out.println("불합격입니다.");
        }

//        4. 홀짝 검사
//        수를 입력받아서 짝수인지 홀수인지 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 4
//        출력 예시
//
//        짝수

        System.out.print("수를 입력하세요 : ");
        int number1 = scan.nextInt();
        System.out.println(number1);
        
        if(number1 % 2 == 0){
            System.out.println("짝수");
        }
        
        if(number1 % 2 != 0){
            System.out.println("홀수");
        }
        
    }
}
