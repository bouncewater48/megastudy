package interfaces.ex.ex02;

public class Naver {

    // 회사이름, 인원수, 창설연도
    private String name;
    private int headcount;
    private int year;

    public Naver(String name, int headcount, int year) {
        this.name = name;
        this.headcount = headcount;
        this.year = year;
    }
    
    // 회사 소개 기능
    public void introduce() {
        System.out.println("저희 회사는 " + name + "이고, " + year + "년에 창설되었습니다. 현재 " + headcount + "명이 일하고 있습니다.");
    }
    
    // 자바 개발자 모집
    public void recruitJavaProgrammer(JavaProgramming applicant) {
        applicant.objectOriented();
    }


}
