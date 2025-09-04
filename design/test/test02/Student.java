package design.test.test02;

public class Student {

    private String name;
    private String school;
    // school2는 기존에 저장된 정보가 아니므로 멤버변수에 기입X
//    private String school2;
    private String number;
    private String subject;

    // 학생
    public Student(String name, String school, String number, String subject) {
        this.name = name;
        this.school = school;
        this.number = number;
        this.subject = subject;
    }


    // 학생 정보
    public void stuInfo() {
        System.out.println(subject + " 수업 : " + school + " " + name + " 학생");
    }

    // 학교 이름 변경 기능
    public void setSchool(String school) {
        this.school = school; // 변경된 school 값을 필드에 저장
        System.out.println(name + " 학생의 학교가 " + school + "로 변경되었습니다.");
    }

    // 변경된 학생 정보
    public void stuInfo2() {
        System.out.println(subject + " 수업 : " + school + " " + name + " 학생");
    }

    // 수업 일정 메시지 전송 기능
    public void message() {
        System.out.println(name + " 학생에게 " + "(" + number + ")" +
                " 수업일정 메시지를 전송 합니다.");
    }

    // 응원 메시지 전송 기능
    public void cheering() {
        System.out.println(name + " 학생에게 " + "(" + number + ")" +
                " 잘하자! 라고 전송 합니다.");
    }


}
