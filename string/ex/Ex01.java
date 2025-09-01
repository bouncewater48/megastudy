package string.ex;

import java.util.Scanner;

// 9. 문자열
public class Ex01 {
    public static void main(String[] args) {

        // 문자열 변수
        String text1 = "Hello World!";

        System.out.println(text1);

        // 문자열 연산
        int number = 10;
        System.out.println(text1 + " " +  number); // Hello World! 10

        String text2 = "!!!!";
        String newText = text1 + text2;

        System.out.println(newText);

        // 문자열 입력
        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String input1 = scan.next();

        System.out.println(input1);

        scan.nextLine();
        System.out.print("문자열을 입력하세요 : ");
        String input2 = scan.nextLine();
        // nextLine()은 사용하기 전에 기존에 줄바꿈이 된게 있는지 확인하고 쓸것, 줄바꿈이 된게 있다면 그걸 먼저 가져가서 출력한다
        // 안전하게 사용하고 싶다면 원하는 라인에 scan.nextLine()을 사용하기 전에 미리 한번 더 사용해둘것
        System.out.println(input2);

    }
}
