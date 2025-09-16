package map.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        
        // Map
        
        // 특정 아이디의 이름 저장
        // key : 아이디
        // value : 이름
        // 저장하고자 하는 궁극적인 데이터 : value
        // key는 중복되지 않아야한다(중복시 추가 저장이 안됨)

        // key와 value는 반드시 같은 형태로 저장하지 않아도 된다
        Map<String, String> memberMap = new HashMap<>();

        // 값 저장 하기
        // .put : key, value를 순서대로 저장(add와 동일)
        // key는 중복되되면 안되지만 value는 중복이 가능하다
        memberMap.put("hagulu", "김인규");
        memberMap.put("yu", "유재석");
        memberMap.put("bada", "바다");
        memberMap.put("ohndar", "김인규");

        System.out.println(memberMap);
//      {bada=바다, ohndar=김인규, yu=유재석, hagulu=김인규}

        // 값 얻어 오기
        String name = memberMap.get("bada");
        System.out.println(name); // 바다

        // null : 객체가 없는 상태 를 의미하는 키워드
        // 문자열이 아닌 int, char 같은 키워드 형태!
        name = memberMap.get("asdf");
        System.out.println(name); // null

        // NulllPointerException : 변수의 상태가 Null이다 (가르키는 변수가 존재하지 않는다 라는 오류코드)
//        name.length();
        String tmp = null;

        // return된 값이 null인지 검증
        if(name == null) {
            // name 에 객체가 대입되어 있다, null이 아니다.
            System.out.println("name은 객체가 대입되어 있지 않습니다.");
        }

        // 특정 키가 존재하는지
        // hagulu 키가 존재한다면 대응되는 이름을 가져온다
        if(memberMap.containsKey("hagulu")) {
            name = memberMap.get("hagulu");
        }
        System.out.println(name);

        // 값 수정
        // 추가와 같은 put 사용. 값이 없다면 새로 추가하고 존재한다면 변경한다
        memberMap.put("ohndar", "박명수");
        System.out.println(memberMap);
//        {bada=바다, ohndar=박명수, yu=유재석, hagulu=김인규}

        // 특수한 환경에서의 맵 반복문

        // 키 목록을 얻어 온다
        // 키를 하나씩 반복문으로 얻어 와서 키를 통해 값을 얻어 온다

        // 키(id) 목록 얻어오기
        Set<String> idSet = memberMap.keySet();
        System.out.println("id : " + idSet);

        for(String id:idSet) {
            name = memberMap.get(id);
            System.out.print(name + " ");
        }
        System.out.println();

        // Iterator로 처리하기
        Iterator<String> iter = idSet.iterator();
        while(iter.hasNext()) {
            String id = iter.next();
//            System.out.print(id + " ");
            System.out.print(memberMap.get(id) + " ");
        }
        System.out.println();

        
    }
}
