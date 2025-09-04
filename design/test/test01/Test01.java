package design.test.test01;

import design.test.test01.Circle;
import design.test.test01.Product;

import java.time.LocalDate;

public class Test01 {
    public static void main(String[] args) {

//        1. 원
//        원을 Class로 설계하세요.
//                멤버 변수는 아래를 참조하세요.
//                반지름
//
//        메서드는 아래를 참조하세요.
//                넓이 구하기, 둘레 구하기, 개수에 따른 넓이 구하기
//
//        pi는 3.14
//
//        원 Class를 이용하여 반지름이 8인 원의 객체를 만들고, 아래 내용을 출력하세요.
//
//        출력 예시
//
//        원의 넓이 : 200.96
//        원의 둘레 : 50.24
//        원 25개 넓이 : 5024.0

        Circle circle = new Circle(8);

        circle.circleInfo();
        System.out.println("원 25개의 넓이 : " + circle.circleCount(25));

//        2. 제품 관리
//        제품 관리 Class를 설계하세요.
//        제품 관리 Class를 통해서 아래 내용을 출력하세요.
//                출력 예시
//
//        이름 : 새우깡
//        가격 : 1300
//        유통기한 : 2021-03-02
//
//        제품 5개의 가격 : 6500
//        제품 13개의 가격 : 16900
//        판매 가능 상품

        System.out.println("=============================");

        Product snack = new Product();
        snack.productInfo("새우깡", 1300, "2025-08-12");

        System.out.println("제품 5개의 가격 : " + snack.calculatePrice(5));
        System.out.println("제품 13개의 가격 : " + snack.calculatePrice(13));

//        유통기한이 지나지 않았을 경우 "판매 가능 상품", 유통기한이 지났을 경우 "판매 불가 상품" (option)

        if(snack.availableSell("2025-09-04")) {
            System.out.println("판매 가능");
        } else {
            System.out.println("판매 불가");
        }
    }
}


