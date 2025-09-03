package oop.ex.ex02;
// 클래스 응용
public class Ex02 {
    public static void main(String[] args) {

        // 직사각형
        // 큰 사각형, 작은 사각형
        Rectangle big = new Rectangle();
        big.width = 58;
        big.height = 84;

        Rectangle small = new Rectangle();
        small.width = 4;
        small.height = 7;

        // 사각형의 넓이
        // 큰 사각형의 넓이
        int bigArea = big.calculateArea();
        System.out.println("큰 사각형의 넓이 : " + bigArea);

        // 작은 사각형의 넓이
        System.out.println("작은 사각형의 넓이 : " + small.calculateArea());
        
        // 큰 사각형 7개의 넓이
        System.out.println("큰 사각형 7개의 넓이 : " + big.calculateArea(7));

        small.printInfo();


    }
}
