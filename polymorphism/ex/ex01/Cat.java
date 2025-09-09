package polymorphism.ex.ex01;

public class Cat extends Animal{

    // 이름
    private String name;

    public Cat(String name) {
        super(name);
    }

    // 그루밍 기능
    public void grooming() {
        System.out.println("햘짝");
    }

    // 우는 기능
    @Override
    public void cry() {
        System.out.println("야옹");
    }

    @Override
    public String toString() {
        return "우리 고양이 : " + getName();
    }

}
