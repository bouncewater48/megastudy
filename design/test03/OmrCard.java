package design.test03;

public class OmrCard {
    
    // 객관식 문제 5개
    private int[] answers = new int[5];
    private String name;
    private String stuId;


    public void setStudentInfo(String name, String stuId) {
        this.name = name;
        this.stuId = stuId;
    }

    // 문제 정답 입력 메소드
    public void setAnswers(int[] answers) {
        if(answers.length == 5){
            this.answers = answers;
        }
    }
    
    // 학생 이름 반환
    public void getName(String name) {
        return name;
    }
    
    // 학번 반환



}
