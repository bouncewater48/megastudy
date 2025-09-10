package polymorphism.test.test01;

public class Dog extends Animal{

    @Override
    public void cry() {
        System.out.println("멍멍");
    }
    
    // 꼬리 흔들기 기능
    public void wagTail() {
        System.out.println("꼬리 흔들흔들");
    }
}
