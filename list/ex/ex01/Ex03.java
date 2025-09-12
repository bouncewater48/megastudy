package list.ex.ex01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();

        numberList.add(5);
        numberList.add(3);
        numberList.add(8);
        numberList.add(1);
        numberList.add(4);
        numberList.add(6);

        System.out.println(numberList); // [5, 3, 8, 1, 4, 6]

        // 유용한 List 메서드
        // 리스트에 특정 값이 존재하는지 여부
        if(numberList.contains(8)) {
            System.out.println("8이 포함 되었습니다.");
        }

        // 정렬 (sorting)
        // 오름차순 정렬
        numberList.sort(Comparator.naturalOrder());
        System.out.println("오름차순 정렬 : " + numberList);

        // 내림차순 정렬
        numberList.sort(Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + numberList);

        // 리스트를 한번에 전부 삭제
        numberList.clear();

        // 리스트가 비어 있는지 여부
        if(numberList.isEmpty()) {
            System.out.println("리스트가 비어 있습니다.");
        }

    }
}
