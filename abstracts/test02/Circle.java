package abstracts.test02;

public class Circle extends Shape{

    // 반지름
    private int radius;

    public Circle(int radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculateRound() {
        return radius * 2 * 3.14;
    }

    @Override
    public String getName() {
        return "원";
    }

    @Override
    public String toString() {
        return "반지름 : " + radius;
    }


}
