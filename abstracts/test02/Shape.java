package abstracts.test02;

public abstract class Shape {

    // 도형의 이름
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    // 넓이를 구하는 기능
    public abstract double calculateArea();

    // 둘레 구하는 기능
    public abstract double calculateRound();

    // 도형의 이름을 얻어 오는 기능
    public abstract String getName();
    
    // 넓이와 둘레르 출력하는 기능
    public void printAreaAndRound() {
        System.out.println(name + " 넓이 : " + calculateArea() + " 둘레 : " + calculateRound());
    }
    
}
