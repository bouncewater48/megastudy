package polymorphism.test.test01;

public class Dog {

    private String name;

    // 이름
    public Dog(String name) {
        this.name = name;
    }

    // 먹이를 먹는 기능
    public void eat() {
        System.out.println("냠냠");
    }
    
    // 우는 기능
    public void cry() {
        System.out.println("멍멍");
    }
    
    // 꼬리 흔들기 기능
    public void wagTail() {
        System.out.println("꼬리 흔들흔들");
    }

}
