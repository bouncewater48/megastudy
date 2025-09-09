package inheritance.test.test02;

public class SharpPencil {

    private int width;  // 펜의 굵기
    private int amount; // 남은 량

    public SharpPencil(int width, int amount) {
        this.width = width;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
