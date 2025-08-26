package variable.test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 사칙연산
//        두 수를 입력받아서 덧셈, 뺄셈, 곱하기, 나누기한 결과를 출력하세요.
//        입력 예시
//
//        입력1 : 5
//        입력2 : 9
//        출력 예시
//
//        덧셈 : 14
//        뺄셈 : -4
//        곱셈 : 45
//        나눗셈 : 0

        /*System.out.print("입력1 : ");
        int a = scan.nextInt();
        System.out.println(a);
        System.out.print("입력2 : ");
        int b = scan.nextInt();
        System.out.println(b);

        System.out.println("덧셈 : " + (a + b));
        System.out.println("뺄셈 : " + (a - b));
        System.out.println("곱셈 : " + (a * b));
        System.out.println("나눗셈 : " + (a / b));*/

//        2. 몫과 나머지
//        두 수를 입력받아서 몫과 나머지를 출력하세요.
//        입력 예시
//
//        입력1 : 843
//        입력2 : 8
//        출력 예시
//
//        몫 : 105 나머지 : 3

        /*System.out.print("입력1 : ");
        int num1 = scan.nextInt();
        System.out.println(num1);
        System.out.print("입력2 : ");
        int num2 = scan.nextInt();
        System.out.println(num2);

        System.out.println("몫 : " + (num1 / num2) + " 나머지 : " + (num1 % num2));*/

//        3. 정사각형 넓이
//        입력받은 숫자의 값을 한 변의 길이로 하는 정사각형의 넓이를 구하여 출력하세요.
//                입력 예시
//
//        길이 : 43
//        출력 예시
//
//        정사각형의 넓이 : 1849

        System.out.print("길이 : ");
        int length = scan.nextInt();
        System.out.println(length);

        System.out.print("정사각형의 넓이 : " + (length * length));

//        4. 삼각형의 넓이
//        밑변과 높이를 입력받아서 삼각형의 넓이를 구하여 출력하세요.
//                입력 예시
//
//        밑변 : 13
//        높이 : 9
//        출력 예시
//
//        삼각형의 넓이 : 58.5

        System.out.print("밑변 : ");
        int length2 = scan.nextInt();
        System.out.println(length2);
        System.out.println("높이 : ");
        int height = scan.nextInt();
        System.out.println(height);

        System.out.println("삼각형의 넓이 : " + (length2 * height)/2);

        /*
        * 5. 교체
        수 두 개를 x, y에 입력받아서 값을 바꿔 출력하세요.
        입력 예시

        x : 6
        y : 4
        출력 예시

        x : 4 y : 6
        * */

        System.out.print("x : ");
        int x = scan.nextInt();
        System.out.print("y : ");
        int y = scan.nextInt();

        int tmp = x;

        // swap 알고리즘
        // x : 6 y : 4 tmp : 6
        x = y;
        // x : 4 y : 4 tmp : 6
        y = tmp;
        // x : 4 y : 6

        System.out.print("x : " + x);
        System.out.print(" y : " + y);


    }
}
