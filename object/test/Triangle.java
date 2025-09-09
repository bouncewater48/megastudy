package object.test;

public class Triangle {

    private int base;   // 밑변
    private int height; // 높이

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        double area = ((base * height) / 2.0);
        return area;
    }

    @Override
    public String toString() {
        return "밑변 : " + base + " 높이 : " + height + " 넓이 : " + calculateArea();
    }

}
