package map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {

//        1. 이씨 찾기
//        Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화하세요.
//        성씨가 '이'씨인 경우에는 값을 'O'로 바꾸고 전체 Map을 출력하세요.
//                반복문을 이용해서 바꾸세요.
//        출력 예시
//
//        {이지은=O, 서장훈=X, 유재석=X, 이광수=O, 박나래=X}

        Map<String, String> memberMap = new HashMap<>();
        Set<String> nameSet = memberMap.keySet();

        memberMap.put("유재석", "X");
        memberMap.put("박나래", "X");
        memberMap.put("이지은", "X");
        memberMap.put("서장훈", "X");
        memberMap.put("이광수", "X");

//        memberMap.replaceAll((key, value) -> {
        for(String name : memberMap.keySet()) {
//            if (memberMap.containsKey("이")) {
            if (name.startsWith("이")) {
                memberMap.put(name,"O");
            }
        };
        System.out.print(memberMap + " ");
        System.out.println();
//        if(memberMap.containsKey("이"))


    }
}
