package design.test.test01;

public class Circle {

    private int radius; // 반지름

    public Circle(int radius) {
        this.radius = radius;
    }

    // 원 넓이 : 반지름 x 반지름 x 원주율
    // 원 둘레 : 2 x 3.14 * 반지름

    // 넓이
    public double calculateArea() {
        double area =  radius * radius * 3.14;

        return area;
    }

    // 둘레
    public double circumference() {
        double area = 2 * 3.14 * radius;

        return area;
    }

    // 원 개수에 따른 넓이
    public double circleCount(double count) {
        double area = calculateArea() * count;
//        위에서 사용한 코드 그대로 사용하기; 유지보수에 훨씬 용이해짐!
//        double area = radius * radius * 3.14 * count;

        return area;
    }

    // 원의 넓이와 둘레
    public void circleInfo() {
        System.out.println("원의 반지름 : " + radius + "\n원의 넓이 : " + calculateArea()
                + "\n원의 둘레 : " + circumference());
    }
}

