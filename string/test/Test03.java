package string.test;

import java.util.Scanner;

// 문자열 : 연습문제; 문자열 함수
public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 문자열 변환
//        아래 문자열에서 A를 B로 바꿔서 출력하세요.
//        String gradeString = "My grade is A";
//        출력 예시
//
//        My grade is B

        String gradeString = "My grade is A";

        String newGrade = gradeString.replace("A", "B");
        // 변수명.replace(변수1, 변수2)
        // 변수1을 변수2로 변경한다

        System.out.println(newGrade);

//        2. 문자열 자르기
//        아래와 같이 전화번호가 저장되어 있을 때 출력 예시와 같은 형태로 -를 포함하여 출력하세요.
//        String phoneNumber = "01012345678";
//        출력 예시
//
//        010-1234-5678

        System.out.println("=============================");

        String phoneNumber = "01012345678";

        String part1 = phoneNumber.substring(0, 3);           // 010
        String part2 = phoneNumber.substring(3, 7);           // 1234
        String part3 = phoneNumber.substring(7);    // 5678

        String phone = part1 + "-" + part2 + "-" + part3;

        System.out.println(phone);


//        3. 문자열 정수 변환
//        아래와 같이 생년월일이 저장된 String이 있을 때 올해 나이를 출력하세요 (한국 나이)
//        String birthString = "19950721";
//        출력 예시
//
//        1995년생의 나이는 29살

        System.out.println("=============================");

//        String birthString = "19950721";
        String birthString = "19990824";

        System.out.println("생년월일을 입력하세요 : " + birthString);

        String birthYearStr = birthString.substring(0, 4); // 1995
        int birthYearInt = Integer.parseInt(birthYearStr);

        int KrAge = 2025 - birthYearInt + 1;

        System.out.println(birthYearStr + "년생의 나이는 " + KrAge + "살");

//        4. 문자열 검색
//        영어 단어를 입력받고 'e'가 몇 개 들어 있는지 출력하세요.
//        입력 예시
//
//        단어를 입력하세요 : elephant
//        출력 예시
//
//        e의 개수는 2개 입니다.

        System.out.println("=============================");
//        scan.nextLine();
//        System.out.print("단어를 입력하세요 : ");
//        String word = scan.nextLine();
        String word = "elephant";


        int count = 0;
        for(int i = 0; i < word.length(); i++) {
//            if(word.equals("e")) {
            if(word.charAt(i) == 'e') {
                // charAt? : String 타입 데이터(문자열)에서 특정 문자를 char타입으로 변환하는 함수;
                // 여기서는 e를 char타입으로 변환한 뒤 e가 있다면 count를 1씩 추가하는 방식을 사용함
                count++;
            }
        }
        System.out.println("elephant에서 e의 개수는 \n" + count + "개 입니다.");
//        System.out.println("e의 개수는 " + count + "개 입니다.");
        scan.close();
//        System.out.println(count + "개");

//        5. 단어 수 세기
//        아래 문자열의 단어 개수를 출력하세요. (중복 포함)
//        String sentence = "To be, or Not to Be. That Is The Question";
//        출력 예시
//
//        단어 개수 : 10

//        문자열 쪼개기 예시, Ex03 참조
//        String memberNames = "강승훈,유재석,하하,황광희,조세호";
//        String[] names = memberNames.split(",");
//
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + " 님");
//        }
        
        System.out.println("=============================");

        String sentence = "To be, or Not to Be. That Is The Question";
        String[] sentences = sentence.split(" ");
        System.out.println("단어 개수 : " + sentences.length);
        // 굳이 반복문 돌릴 필요 없이 그냥 배열 length 그대로 출력해도 됨
//        System.out.println(sentence.length()); // 41
//
//        int countWord = 0;
//        for(int i = 0; i < sentences.length; i++) {
//            if(i > 0) {
//                countWord++;
//            }
////        }
//        System.out.println("단어 개수 : " + (countWord + 1)); // 0부터 시작이므로 실제 개수는 +1을 해줘야함!



//        System.out.println("찾을 단어를 입력하세요 : ");
////        String searchWord = scan.nextLine();
//        char searchWord = scan.nextLine().charAt(0);
//
//        int countWord = 0;
//        for (int i = 0; i < sentence.length(); i++) {
//            if(sentence.charAt(i) == searchWord){
//                countWord++;
//            }
//        }
//        System.out.println("단어 개수 : " + countWord);
        

    }
}
