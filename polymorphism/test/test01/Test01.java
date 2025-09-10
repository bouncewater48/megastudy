package polymorphism.test.test01;

public class Test01 {

    //    1. 다형성
//    아래와 같은 특성을 가지는 개와 고양이 Class를 설계하세요.
//    개는 먹이를 "냠냠" 하고 먹고, "멍멍" 하고 울며, "꼬리 흔들흔들" 꼬리 흔들기를 합니다.
//    고양이는 먹이를 "냠냠" 하고 먹고, "야옹" 하며 울며, "핥짝핥짝" 그루밍을 합니다.
//    단, Animal이라는 Class를 부모로 갖도록 Animal Class와 각각의 Class를 설계하세요.
//    Animal 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해 아래와 같이 출력하세요.
//
//    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Cat();
//        animals[1] = new Dog();
//
//        // TODO: 구현하기
//    }
//    출력 예시
//
//    야옹
//            야옹
//    야옹
//            멍멍
//    멍멍
//            멍멍
//    핥짝핥짝 그루밍
//    꼬리 흔들흔들
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        for(int i = 0; i < animals.length; i++) {
            animals[i].cry();
            animals[i].cry();
            animals[i].cry();
        }

        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Cat) {
                Cat cat = (Cat) animals[i];
                cat.grooming();
            } else if(animals[i] instanceof Dog) {
                Dog dog = (Dog) animals[i];
                dog.wagTail();
            }
        }


    }
}
