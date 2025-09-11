package interfaces.ex.ex02;

// 지원자 규격
public class JobApplicant implements JavaProgramming{

    // 이름, 학점, 나이
    private String name;
    private double grade;
    private int age;

    public JobApplicant(String name, double grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
    
    // 자기소개 기능
    public void introduce() {
        System.out.println("저는 " + name + "입니다. 학점은 " + grade + "이고, 나이는 " + age + "살 입니다.");
    }

    @Override
    public void objectOriented() {
        System.out.println("객체지향 프로그래밍은 객체를 지향하는 프로그래밍입니다.");
    }

}
