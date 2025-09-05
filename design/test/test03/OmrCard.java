package design.test.test03;

public class OmrCard {

    // 이름, 학번, 마킹한 답
    private String name;
    private String studentId;
    private int[] marking = new int[5];

    // 생성자
    // 이름과 학번을 반환하는 생성자
    public OmrCard(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    // 마킹한 답을 반환하는 생성자
    public void setMarking(int marking1, int marking2, int marking3, int marking4, int marking5) {
        marking[0] = marking1;
        marking[1] = marking2;
        marking[2] = marking3;
        marking[3] = marking4;
        marking[4] = marking5;
    }
    
    // 학생 정보 출력 기능
    public void printStudentInfo() {
        System.out.println("이름 : " + name);
        System.out.println("학번 ; " + studentId);
    }
    

    public void printInfo() {
        printStudentInfo();
        System.out.print("마킹한 답 : ");
        for(int i = 0; i < marking.length; i++) {
            System.out.print(marking[i] + " ");
        }
        System.out.println();
    }

    public int[] getMarking() {
        return marking;
    }

}
