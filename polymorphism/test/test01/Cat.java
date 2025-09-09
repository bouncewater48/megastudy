package polymorphism.test.test01;

public class Cat {

    private String name;

    // 이름
    public Cat(String name) {
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

    // 그루밍 기능
    public void grooming() {
        System.out.println("핥짝핥짝");
    }

}
