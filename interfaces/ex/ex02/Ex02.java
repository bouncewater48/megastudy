package interfaces.ex.ex02;

public class Ex02 {
    public static void main(String[] args) {
        
        // 취업 공고를 올리는 회사
        Naver naver = new Naver("네이버", 2912, 2001);
        naver.introduce();

        // 지원자
         JobApplicant applicant = new JobApplicant("강승훈", 3.5, 27);
         applicant.introduce();

        naver.recruitJavaProgrammer(applicant);
        
    }
}
