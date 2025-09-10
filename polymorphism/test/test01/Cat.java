package polymorphism.test.test01;

public class Cat extends Animal{

    @Override
    public void cry() {
        System.out.println("야옹");
    }

    // 그루밍 기능
    public void grooming() {
        System.out.println("핥짝핥짝 그루밍");
    }
}
