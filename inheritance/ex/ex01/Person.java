package inheritance.ex.ex01;

public class Person {

    // 이름, 생년월일
    // protected : 자기자신과 자식 클래스만 사용가능, 같은 패키지에서 사용가능
    private String name;
//    protected String name;
    private String birthday;
//    protected String birthday;

//    public Person() {
//        System.out.println("Person 생성");
//    }

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public void printInfo() {
        System.out.println("이름 : " + name + "\n생년월일 : " + birthday);
    }

}
