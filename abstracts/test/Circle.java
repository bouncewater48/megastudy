package abstracts.test;

public class Circle extends Shape{

    private double radius; // 반지름

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String name() {
        return "원";
    }
    
    @Override
    public double area() {
        return (3.14 * radius * radius);
    }

    @Override
    public double circumference() {
        return (radius * 2) * 3.14;
    }

}
