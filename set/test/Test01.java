package set.test;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

//        System.out.println("set1 : " + set1);
//        System.out.println("set2 : " + set2);

        Set<Integer> setVolume = new HashSet<>();
        setVolume.addAll(set1);
        setVolume.addAll(set2);

        System.out.println("합집합 : " + setVolume);

        Set<Integer> setDifference = new HashSet<>();
        setDifference.addAll(setVolume);
        setDifference.removeAll(set2);
        System.out.println("차집합 : " + setDifference);

        Set<Integer> setIntersection = new HashSet<>();
//        setIntersection.addAll(setVolume);
//        setIntersection.retainAll(set1);

//        굳이 위에서 사용한 합집합 셋을 사용하지 않고 set1에서 set2의 요소만 retain해도 된다!
        setIntersection.addAll(set1);
        setIntersection.retainAll(set2);
        System.out.println("교집합 : " + setIntersection);



    }
}
