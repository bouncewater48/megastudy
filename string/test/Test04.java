package string.test;

import java.util.Scanner;

// 문자열: 연습문제; 문자열 고급
public class Test04 {
    public static void main(String[] args) {

//        1. 문자열 검색
//        파일 이름이 저장된 문자열 배열에서 jpg 파일이 몇 개인지 출력하세요.
//        String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//        출력 예시
//
//        jpg 파일 개수 : 3

        String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//        String JPG = ".jpg";
        int jpgCount = 0;

        for(int i = 0; i < files.length; i++) {
//            if(JPG.endsWith(JPG)) {
            if(files[i].endsWith(".jpg"))
        // files[i]        .endsWith            (".jpg")
        // files 배열에서   ~로 끝나는걸 찾아라     .jpg로
                jpgCount++;
//                System.out.println("jpg 파일 개수 : " + jpgCount);
            }
        System.out.println("jpg 파일 개수 : " + jpgCount);


//        2. 영 단어 퀴즈
//        영어 단어 퀴즈를 낸다.
//        아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
//        100점 만점 기준으로 몇 점인지 출력한다.
//        1. 승리를 영어로 입력하세요 :
//        2. 사랑을 영어로 입력하세요 :
//        3. 컴퓨터를 영어로 입력하세요 :
//        4. 노트북을 영어로 입력하세요 :
//        입력 예시
//
//        1. 승리를 영어로 입력하세요 : victory
//        2. 사랑을 영어로 입력하세요 : love
//        3. 컴퓨터를 영어로 입력하세요 : computer
//        4. 노트북을 영어로 입력하세요 : notebook
//        출력 예시
//
//        점수는 75점 입니다.

        System.out.println("=============================");

        Scanner scan = new Scanner(System.in);

        int score = 0;
        int answerCount = 25;

        System.out.print("승리를 영어로 입력하세요 : ");
        String answer1 = scan.next();
        System.out.print("사랑을 영어로 입력하세요 : ");
        String answer2 = scan.next();
        System.out.print("컴퓨터를 영어로 입력하세요 : ");
        String answer3 = scan.next();
        System.out.print("노트북을 영어로 입력하세요 : ");
        String answer4 = scan.next();

        if(answer1.equals("victory")) {
            score += 25;
        }
        if(answer2.equals("love")) {
            score += 25;
        }
        if(answer3.equals("computer")) {
            score += 25;
        }
        if(answer4.equals("notebook")) {
            score += 25;
        }
        System.out.println("점수는 " + score + "점 입니다.");

//        3. 문자열 검색
//        회원 명부가 아래와 같이 문자열이 저장되어 있다. 같은 이름이 몇 개인지 출력하세요.
//                String membersString = "김혜수:송강호:정우성:이민호:송강호:이민정:이민정:이정재:이병헌:이정재";
//        출력 예시
//
//        동명 수 : 3

        System.out.println("=============================");




    }
}
