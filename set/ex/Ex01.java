package set.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        
        // Set // 인터페이스 형태
        // 같은 형태의 데이터를 여러개 저장
        // 순서가 없다 (index 가 없다)
        // 중복된 값은 추가되지 않는다.
        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(8);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(3);
        set.add(5);

        System.out.println(set);
        
        if(set.contains(4)) {
            System.out.println("4가 존재");
        }

        for(int number:set) {
            System.out.print(number + " ");
        }
        System.out.println();

        Iterator<Integer> iter = set.iterator();

        while(iter.hasNext()) {
            int number = iter.next();

            System.out.print(number + " ");
        }
        System.out.println();

    }
}
