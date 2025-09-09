package inheritance.test.test02;

public class BallPen extends SharpPencil{

    private String color; // 볼펜의 색

    public BallPen(int width, int amount) {
        super(width, amount);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
