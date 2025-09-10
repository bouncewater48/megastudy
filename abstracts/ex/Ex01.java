package abstracts.ex;

public class Ex01 {
    public static void main(String[] args) {

        // 추상 클래스는 완성되지 않은 클래스이기 때문에 객체생성이 불가하다
//        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.eat();
        dog.cry();
        dog.wagTail();

        Animal animal = dog;

        Animal animal2 = dog;

    }
}
