package polymorphism.test.test02;

public class Circle extends Shape{

    private double radius; // 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (3.14 * radius * radius);
    }

    @Override
    public String name() {
        return "원";
    }
}
