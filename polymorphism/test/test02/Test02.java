package polymorphism.test.test02;

public class Test02 {

    //    1. 다형성 응용
//    도형을 관리하고 넓이를 계산하는 원, 삼각형, 사각형 Class를 설계하세요.
//    Shape라고 하는 Class를 부모로 갖도록 Shape Class와 각 도형 Class를 구현하세요.
//    Shape 배열에 객체를 담아서 업캐스팅, 다운캐스팅을 사용해 아래와 같이 출력하세요.
//    원주율 pi는 3.14로 계산하세요.
//    public static void main(String[] args) {
//        Shape[] shape = new Shape[3];
//
//        // upcasting
//        shape[0] = new Triangle(8, 10);
//        shape[1] = new Rectangle(7, 13);
//        shape[2] = new Circle(12);
//
//        // TODO: 구현하기
//    }
//    출력 예시
//
//    삼각형의 넓이는 40.0cm^2 입니다.
//    사각형의 넓이는 91.0cm^2 입니다.
//    원의 넓이는 452.16cm^2 입니다.
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];

        // upcasting
        shape[0] = new Triangle(8, 10);
        shape[1] = new Square(7, 13);
        shape[2] = new Circle(12);

        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Circle) {
                // 원의 넓이
            System.out.printf("%s의 넓이는 %.2fcm^2 입니다.\n",
                    shape[i].name(), shape[i].area());
            } else {
                // 일반 도형의 넓이
                System.out.println(shape[i].name() + "의 넓이는 " + shape[i].area() + "cm^2 입니다.");
            }

        }
    }
}
