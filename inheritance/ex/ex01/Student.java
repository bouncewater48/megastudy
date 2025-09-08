package inheritance.ex.ex01;

// Person을 확장해서 Student 클래스를 구성
// Person의 속성과 기능을 모두 물려받은 Student 클래스 구성
// Person : 부모클래스, Student : 자식클래스
public class Student extends Person{
    // 이름, 생년월일, 학교
    private String school;

    
    public Student(String name, String birthday, String school) {
        // 자식 클래스 생성자에서는 부모클래스 생성자가 필수로 호출 되어야 한다
        // 기본생성자가 있는 경우 자동으로 호출 됨
        // 없거나, 필요에 따라 직접 호출할 수 있음
        // 부모클래스 생성자는 반드시 자식클래스 생성자 위에 있어야한다
//        super();
//        System.out.println("Student 생성");
        super(name, birthday);
//         this.name = name;
//         this.birthday = birthday;
         this.school = school;
    }

    @Override
    public void printInfo() {
//        System.out.println("이름 : " + name + "\n생년월일 : " + birthday + "\n학교명 : " + school);
        super.printInfo();
        System.out.println("학교명 : " + school);
    }


}
