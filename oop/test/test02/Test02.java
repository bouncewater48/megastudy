package oop.test.test02;

import java.time.LocalDate;

// 클래스 : 연습문제; Class 와 메서드
public class Test02 {
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

        Circle rad = new Circle();
        rad.radius = 8;

        rad.circleInfo();
        System.out.println("원 25개의 넓이 : " + rad.circleCount(25));

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

        Product shrimp = new Product();
        shrimp.name = "새우깡";
        shrimp.price = 1300;
        shrimp.Expiration = "2021-03-02\n";

        shrimp.productInfo();

        System.out.println("제품 5개의 가격 : " + shrimp.priceCount(5));
        System.out.println("제품 13개의 가격 : " + shrimp.priceCount(13));

//        유통기한이 지나지 않았을 경우 "판매 가능 상품", 유통기한이 지났을 경우 "판매 불가 상품" (option)
//        날짜계산 참고링크 :
//        https://hajoung56.tistory.com/67#google_vignette

        // 판매 가능 여부 확인 기능
//        boolean availableSale(String date) {
//
//        }

        LocalDate dateNow = LocalDate.of(2021, 03, 02);
        LocalDate date1 = LocalDate.of(2021, 02, 20);
        LocalDate date2 = LocalDate.of(2021, 03, 05);

//        if(date1.isBefore(dateNow)) {
        if(date2.isBefore(dateNow)) {
            System.out.println("판매 가능 상품");
        } else {
            System.out.println("판매 불가 상품");
        }
    }
}
