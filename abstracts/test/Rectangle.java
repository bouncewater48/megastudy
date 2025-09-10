package abstracts.test;
// 사각형
public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String name() {
        return "사각형";
    }

    @Override
    public double area() {
        return (width * height);
    }

    @Override
    public double circumference() {
        return (width * 4);
    }

}
