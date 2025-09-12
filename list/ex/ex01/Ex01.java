package list.ex.ex01;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        // 리스트
        // 같은 형태의 데이터를 여러개 저장
        // index를 기반으로 값을 접근하고 순서가 있다.

        // 정수 리스트
        List<Integer> numberList = new ArrayList<>();

        // 리스트에 값 추가
        numberList.add(10);
        numberList.add(20);
//        numberList.add("15"); <Integer>로 작성했기에 String타입으로는 작성 불가, <String> 타입으로 작성 시 사용가능

        System.out.println(numberList); // [10, 20]

        // 값 삽입
        numberList.add(1, 15); // 1번 인덱스 자리에 15를 넣겠다
        System.out.println(numberList); // [10, 15, 20]

        // 값 수정
        numberList.set(2, 25); // 2번 인덱스를 25로 수정
        System.out.println(numberList); // [10, 15, 25]

        // 값 삭제
        numberList.remove(1); // 1번 인덱스를 삭제하겠다;
        // 기본적으로 인덱스 내 정수가 아닌 인덱스 위치값으로 작성된다
        System.out.println(numberList); // [10, 25]

        // 특정 값 얻어오기
        Integer number = numberList.get(1); // 1번 인덱스 값만 가져오기
        System.out.println(number);     // 25

        // 래퍼클래스 객체는 가능하면 기본자료형으로 활용
        int number2 = numberList.get(1);// Integer이 아닌 int로 작성
        System.out.println(number2);    // 25

        // 문자열 리스트
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("bear");
        stringList.add("chair");

        System.out.println(stringList); // [apple, bear, chair]

        // 값 삭제 - 값을 통한 삭제
        stringList.remove("bear");
        System.out.println(stringList); // [apple, chair]


    }
}
