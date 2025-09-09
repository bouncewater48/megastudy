package inheritance.test.test02;

public class FountainPen extends BallPen{

    public FountainPen(int width, int amount) {
        super(width, amount);
    }

    public void refill(int n) {
        setAmount(n);
    }
}
