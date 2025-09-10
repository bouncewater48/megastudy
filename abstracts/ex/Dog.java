package abstracts.ex;

public class Dog extends Animal{

    // 부모클래스의 추상메서드는 필수로 구현해야한다
    // 구현하지 않을 경우 미완성된 클래스로 똑같은 추상클래스가 된다
    @Override
    public void cry() {
        System.out.println("멍멍!");
    }
    
    public void wagTail() {
        System.out.println("흔들흔들");
    }

}
