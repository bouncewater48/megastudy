package list.test.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {


//    1. List 만들기
//    리스트에 주어진 값들을 저장하세요.
//            20 3 5 84 17

        List<Integer> numberList = new ArrayList<>();
        numberList.add(20);
        numberList.add(3);
        numberList.add(5);
        numberList.add(84);
        numberList.add(17);
        System.out.println("1번 : " + numberList);


//            2. 최소 값 구하기
//    List에서 가장 작은 값을 출력하세요.
//    향상된 for문을 사용하세요.
//            출력 예시
//
//        3

        int min = numberList.get(0);
        for (int number : numberList) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("2번 : " + min);


//        3. 합계 구하기
//    List 요소들의 총 합계를 구하세요.
//    Iterator를 사용하세요.
//    출력 예시
//
//        129

        Iterator<Integer> iter = numberList.iterator();

        int sum = 0;
        while (iter.hasNext()) {
            sum += iter.next();
        }
        System.out.println("3번 : " + sum);

//        4. 최대 값 구하기
//    List에서 가장 큰 값을 출력하세요.
//    최대 값이 저장된 index도 출력하세요.
//            출력 예시
//
//        값 : 84
//        index : 3

        int max = numberList.get(0);
        int maxIndex = 0;

//        for (int number : numberList) {
            for (int i = 0; i < numberList.size(); i++) {
//                if (max < number) {
                if(numberList.get(i) > max) {
                    max = numberList.get(i);
                    maxIndex = i;
                }
            }
            System.out.println("4번 : " + "\n값 : " + max + "\nindex : " + maxIndex);
//        }

//        5. 리스트 삭제
//    List에서 짝수인 값을 모두 삭제하고 전체 값을 출력하세요.
//    출력 예시
//
//        [3, 5, 17]

        Iterator<Integer> number1 = numberList.iterator();

        while(number1.hasNext()) {
            if(number1.next() % 2 == 0) {
                number1.remove();
            }
        }
        System.out.println("5번 : " + numberList);


    }
}
