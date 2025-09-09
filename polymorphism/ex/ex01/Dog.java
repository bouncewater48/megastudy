package polymorphism.ex.ex01;

public class Dog extends Animal{

    // 이름
    private String name;

    public Dog(String name) {
        super(name);
    }

    
    // 꼬리 흔들기 기능
    public void wagTail() {
        System.out.println("흔들흔들");
    }
    
    // 짖는 기능
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }

    @Override
    public String toString() {
        return "우리 강아지 : " + getName();
    }

}
