package string.test;

import java.util.Scanner;

// 문자열 : 연습문제; 문자열 다루기2
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 정수 문자열 변환
//        아래와 같이 생년월일이 저장된 정수 변수가 있다.
//                해당 변수를 아래와 같이 생년월일을 표시하는 문자열로 변환하고 출력하세요.
//        int year = 2000;
//        int month = 11;
//        int day = 15;
//        출력 예시
//
//        20001115

        int year = 2000;
        int month = 11;
        int day = 15;

        String year1 = Integer.toString(year);
        String month1 = Integer.toString(month);
        String day1 = Integer.toString(day);

        System.out.println(year1 + month1 + day1);

//        2. 문자열 정수 변환
//        아래와 같이 생년이 저장된 String이 있을 때 올해 나이를 출력하세요 (한국 나이)
//        String yearString = "1995";
//        출력 예시
//
//        1995년생의 나이는 29살

        System.out.println("=============================");
        System.out.print("생년을 입력하세요 : ");

        String yearString = scan.next();

        int yearInt = Integer.parseInt(yearString);
        int yearInt2 = 2025 - yearInt + 1;

        System.out.println(yearString + "년생의 나이는 " + yearInt2  + "살");


//        3. 개수 세기
//        아래 배열에 물품 목록이 저장되어 있다.
//        String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};
//        제품명을 입력받고 해당 제품이 배열에 몇 개 있는지 출력하세요.
//                입력 예시
//
//        제품명 : 육개장
//        출력 예시
//
//        3개

        System.out.println("=============================");

        String[] goods = {"새우깡", "육개장", "신라면", "코카콜라", "육개장", "육개장", "새우깡", "신라면"};

        scan.nextLine();
        System.out.print("제품명 : ");
        String input = scan.nextLine();

        int count = 0;
        for (int i = 0; i < goods.length; i++ ) {
            if (goods[i].equals(input)) {
                count++;
            }
        }
        System.out.println(count + "개");

    }
}
