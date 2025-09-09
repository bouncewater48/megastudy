package object.test;

public class Test01 {

    //    1. 삼각형 Class
//    삼각형 Class를 구현하세요.
//    Object Class의 메서드를 Override해서 아래와 같이 출력하세요.
//    밑변 : 10 높이 : 14 넓이 : 70.0
//    밑변 : 8 높이 : 16 넓이 : 64.0
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(10, 14);
        System.out.println(triangle1);

        Triangle triangle2 = new Triangle(8, 16);
        System.out.println(triangle2);

    }
}
