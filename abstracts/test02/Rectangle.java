package abstracts.test02;

public class Rectangle extends Shape{

    // 가로
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (width * height);
    }

    @Override
    public double calculateRound() {
        return (width + height) * 2;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public String toString() {
        return "가로 ; " + width + "세로 : " + height;
    }

}
