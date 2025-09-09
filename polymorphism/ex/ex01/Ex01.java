package polymorphism.ex.ex01;

// 다형성
public class Ex01 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물");
        animal.eat();
        System.out.println();

        Dog tory = new Dog("토리");
        Cat bada = new Cat("바다");

        tory.eat();
        tory.cry();
        tory.wagTail();
        System.out.println();

        bada.eat();
        bada.cry();
        bada.grooming();

        System.out.println("=================");

        // 업캐스팅(Up Casting)
        // 자식 클래스 객체를 부모클래스 변수로 다루는 방법
        // 부모클래스 기능만 활용 가능
        Animal animal1 = new Dog("해피");

        animal1.eat();
//        animal1.wagTail();

        Dog happy = (Dog)animal1;
        happy.wagTail();

        Animal[] animals = new Animal[2];
        animals[0] = tory;
        animals[1] = bada;

        for (int i = 0; i < animals.length; i++) {
            // 같은 부모클래스를 가진 객체의 공통 기능을 활용할 수 있다.
            animals[i].eat();
            // Override 된 메서드는 우선순위를 가진다
            animals[i].cry();

            if (animals[i] instanceof Cat) {
                // 고양이는 그루밍 기능 수행
                Cat cat = (Cat) animals[i];
                cat.grooming();
            }
        }

    }
}
