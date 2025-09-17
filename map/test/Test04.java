package map.test;

import java.util.*;

public class Test04 {
    public static void main(String[] args) {

//        1. 파티원 구하기
//        필요한 파티원의 정보를 출력하세요.
//
//        n명의 게임 캐릭터 정보가 주어진다.
//                필요한 파티원 조건:
//
//        myCharacter와 같은 서버의 "힐러" 직업을 가진 멤버 후보를 모두 출력한다.
//        보너스 문제: 같은 서버의 힐러 중 레벨이 가장 높은 사람만 출력하세요.
//
//        public static void main(String[] args) {
            Map<String, String> myCharacter = new HashMap<>();
            myCharacter.put("닉네임", "마로비아나");
            myCharacter.put("직업", "마법사");
            myCharacter.put("서버", "B");
            myCharacter.put("레벨", "38");

            // [{닉네임=닉네임1, 직업=전사, 레벨=5}, {닉네임=닉네임1, 직업=전사, 레벨=5}...]
            List<Map<String, String>> characterList = new ArrayList<>();
            Map<String, String> character1 = new HashMap<>();
            character1.put("닉네임", "사자고양이");
            character1.put("직업", "전사");
            character1.put("서버", "A");
            character1.put("레벨", "11");
            characterList.add(character1);

            Map<String, String> character2 = new HashMap<>();
            character2.put("닉네임", "하구루");
            character2.put("직업", "마법사");
            character2.put("서버", "B");
            character2.put("레벨", "46");
            characterList.add(character2);

            Map<String, String> character3 = new HashMap<>();
            character3.put("닉네임", "바다");
            character3.put("직업", "힐러");
            character3.put("서버", "B");
            character3.put("레벨", "23");
            characterList.add(character3);

            Map<String, String> character4 = new HashMap<>();
            character4.put("닉네임", "초보");
            character4.put("직업", "힐러");
            character4.put("서버", "A");
            character4.put("레벨", "4");
            characterList.add(character4);

            Map<String, String> character5 = new HashMap<>();
            character5.put("닉네임", "남라");
            character5.put("직업", "힐러");
            character5.put("서버", "B");
            character5.put("레벨", "84");
            characterList.add(character5);

            // 같은 서버 힐러 찾기
//        Set<String> serverSet = myCharacter.keySet();
        System.out.println("힐러 탐색 결과 : ");

        String myServer = myCharacter.get("서버");
        for(int i = 0; i < characterList.size(); i++) {
            Map<String, String> character = characterList.get(i);

            if("힐러".equals(character.get("직업")) && myServer.equals(character.get("서버"))) {
                System.out.println("닉네임 : " + character.get("닉네임"));
                System.out.println("직업 : " + character.get("직업"));
                System.out.println("서버 : " + character.get("서버"));
                System.out.println("레벨 : " + character.get("레벨"));
                System.out.println();
            }
        }

        // 같은 서버의 힐러 중 최고레벨 찾기
        System.out.println("최고 레벨 힐러 탐색 결과 : ");
        int maxLevel = -1;
        Map<String, String> bestHealer = null;

        for(int i = 0; i < characterList.size(); i++) {
            Map<String, String> character = characterList.get(i);

            if("힐러".equals(character.get("직업")) && myServer.equals(character.get("서버"))) {
                int level = Integer.parseInt(character.get("레벨"));
                if(level > maxLevel) {
                    level = maxLevel;
                    bestHealer = character;
                }
            }
        }

        if(bestHealer != null) {
            System.out.println("닉네임 : " + bestHealer.get("닉네임"));
            System.out.println("직업 : " + bestHealer.get("직업"));
            System.out.println("서버 : " + bestHealer.get("서버"));
            System.out.println("레벨 : " + bestHealer.get("레벨"));
            System.out.println();
        }



//            // TODO: 구현
//        }
//        출력 예시
//
//        힐러 탐색 결과
//        닉네임 : 남라
//        직업 : 힐러
//        서버 : B
//        레벨 : 84
    }
}
