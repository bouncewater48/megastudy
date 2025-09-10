package polymorphism.test.test02;

public class Square extends Shape{

    private double width;  // 가로
    private double height; // 세로

    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return (width * height);
    }

    @Override
    public String name() {
        return "사각형";
    }
}
