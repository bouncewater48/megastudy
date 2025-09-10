package polymorphism.test.test02;

public class Triangle extends Shape{

    private double base;   // 밑변
    private double height; // 높이

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base * height) / 2.0;
    }

    @Override
    public String name() {
        return "삼각형";
    }
}
