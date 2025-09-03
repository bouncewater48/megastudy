package oop.ex.ex02;

public class Rectangle {

    // 가로, 세로
    int width;
    int height;

    // 기능, method(메서드), 멤버 함수
    // 넓이를 구하는 기능
    int calculateArea() {
        int area = width * height; // area(넓이) = 가로 * 세로

        return area; // 넓이를 리턴
    }
    
    // 개수에 따른 넓이 구하기
    // 개수는 고정값이 아닌 그때그때 변하는 값이므로 멤버변수로 넣지 않는게 좋다 / 멤버변수? int width, int height
    // 같은 이름의 메서드
    // 조건 : 파라미터의 개수, 타입이 다른 경우
    // Overloading(오버로딩)
    int calculateArea(int count) {
        int area = width  * height * count;

        return area;
    }
    
    // 클래스를 만들때 필수적으로 만들면 좋은 메서드
    // 객체 정보를 출력하는 기능
    // 멤버 변수를 출력하는 기능
    // 유지보수에 용이하다
    void printInfo() {
        System.out.println("가로 : " + width + " / 세로 : " + height);
    }

}
