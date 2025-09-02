package oop.ex;
// 01. 클래스
public class Ex01 {
    public static void main(String[] args) {

        // 과목이름, 성적, 석차
        // 객체 생성
//        int number = 0;

        // 생성된 데이터를 변수에 저장
        ScoreData korean = new ScoreData();
        korean.subject = "국어";
        korean.score = 80;
        korean.ranking = 12;

        ScoreData english = new ScoreData();
        english.subject = "영어";
        english.score = 90;
        english.ranking = 8;

        // 국어 점수 : 80 석차 : 12
        System.out.println(korean.subject + " \n점수 : " + korean.score + " \n석차 : " + korean.ranking);
        System.out.println();
        System.out.println(english.subject + " \n점수 : " + english.score + " \n석차 : " + english.ranking);

    }
}
