package string.test;

import java.util.Scanner;

// 문자열 : 연습문제; 문자열 다루기1
public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 문자열 출력
//        문자열 변수를 세 개 만들어서 아래 문장의 단어를 하나씩 저장하세요.
//        세 변수를 이용해서 아래 내용처럼 출력하세요.
//        Oh My God

        String Oh = "Oh";
        String My = "My";
        String God = "God";

        System.out.println(Oh + " " + My + " " + God);

//        2. 문자열 입력
//        id를 입력받고, 아래와 같이 환영 메시지를 출력하세요.
//        Welcome! id
//        입력 예시
//
//        ID를 입력하세요 : hagulu
//        출력 예시
//
//        Welcome! hagulu

        System.out.println("=============================");

        System.out.print("ID를 입력하세요 : ");

        String id = scan.next();

        System.out.println("Welcome! " + id);

//        3. 문자열 배열
//        아래와 같이 문장을 입력하고, 이 문장의 단어를 하나씩 문자열 배열에 저장하세요.
//        저장된 단어를 한 줄에 하나씩 출력하세요.
//        입력 예시
//
//        Why so serious
//        출력 예시
//
//        Why
//                so
//        serious

        // 배열로도 출력해보기
        System.out.println("=============================");

        /* scan.nextLine();
        System.out.println("문장을 입력해주세요 : ");
//        scan.nextLine();
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String word3 = scan.nextLine();

        String[] word = {word1, word2, word3}; // 이 방식은 단어를 하나하나 작성해야하며, 한번에 문장형식으로 입력시 입력불가

        System.out.println(word[0] + " " + word[1] + " " + word[2]);
        scan.close(); */

        // 문장형으로 작성해서 출력하기
        scan.nextLine();
        System.out.print("문장을 입력하세요 : ");
        String word = scan.nextLine();
        String[] words = word.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        scan.close();

//        String Why = scan.next();
//        String so = scan.next();
//        String serious = scan.next();
//
//        System.out.println(Why + "\n" + so + "\n" + serious);

    }
}
