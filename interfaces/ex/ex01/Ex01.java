package interfaces.ex.ex01;

public class Ex01 {
    public static void main(String[] args) {

//        new Animal();
        Cat cat = new Cat();
        cat.eat();
        cat.cry();
        cat.grooming();

        // 인터페이스도 업캐스팅처럼 이용할 수 있다
        Animal animal = cat;
        animal.eat();
        animal.cry();

    }
}
