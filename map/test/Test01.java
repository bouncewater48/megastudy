package map.test;

import java.sql.SQLOutput;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {


//    1. 자료 입력
//    아래 과목 이름과 성적 정보를 Map에 저장하고 출력하세요.
//    국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
//    출력 예시
//
//    {국어=90, 사회=80, 과학=100, 수학=85, 영어=90}

        Map<String, Integer> achievementMap = new HashMap<>();
        achievementMap.put("국어",90);
        achievementMap.put("수학",85);
        achievementMap.put("영어",90);
        achievementMap.put("사회",80);
        achievementMap.put("과학",100);
        System.out.println(achievementMap);


//2. 값 수정
//    사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다. 값을 바꾸고 출력하세요.
//            출력 예시
//
//    {국어=90, 사회=85, 과학=100, 수학=85, 영어=90}

        System.out.println("==========================================");

        int score1 = achievementMap.get("사회");
        achievementMap.put("사회", score1 + 5);
        System.out.println(achievementMap);

//3. 값 찾기
//    과목명을 입력받고 점수를 출력하세요.
//    단, 입력한 과목이 없을 경우 "자료 없음"을 출력하세요.
//    입력 예시
//
//    조회할 과목명을 입력하세요 : 영어
//    출력 예시
//
//    영어 : 90

        System.out.println("==========================================");
        Scanner scan = new Scanner(System.in);
        Set<String> subjectSet = achievementMap.keySet();
//        System.out.println(subjectSet);

        System.out.print("조회할 과목명을 입력하세요 : ");
        String subject = scan.next();

        if(achievementMap.containsKey(subject)) {
            int score = achievementMap.get(subject);
            System.out.print(subject + " : " + score);
        } else {
            System.out.print("자료 없음");
        }
        System.out.println();
        scan.close();
//        for(String sub:subjectSet) {
//            Integer score = achievementMap.get(sub); // sub : 과목명, score : 점수
//            System.out.print(sub + " ");
//            if(Boolean.parseBoolean(subName = sub)) {
//                System.out.println(score);
//            } else {
//                System.out.println("자료 없음");
//            }
//            break;
//        }

//        for(String sub:subjectSet) {
//            Integer subName = achievementMap.get(sub);
//            System.out.print(subName + " ");
//        }

//            4. 값 찾기
//90점 이상의 모든 과목을 출력하세요.
//            출력 예시
//
//    국어 과학 영어

        System.out.println("==========================================");

//        Iterator<String> iter = subjectSet.iterator();
        Set<String> subSet = achievementMap.keySet();

        // 향상된 for문
        for(String sub:subSet) {
            int score = achievementMap.get(sub);
            if(score >= 90){
                System.out.print(sub + " ");
            }
        }
        System.out.println();



//5. 값 확인
//100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
//    성적 우수상을 받을 수 있는지 출력하세요.
//    출력 예시
//
//    수상 가능

        System.out.println("==========================================");

        boolean award = false;

        Iterator<String> iter = subjectSet.iterator();

        for(String sub:subSet) {
            score1 = achievementMap.get(sub);
            if(score1 == 100) {
                System.out.print("수상 가능");
                break;
            }
        }

//        while(iter.hasNext()) {
//            String Sub = iter.next();
//            int score = achievementMap.get(subject);
//            if(score == 100) {
//                award = true;
//                break;
//            }
//        }
//
//        if(award) {
//            System.out.print("수상 가능");
//        } else {
//            System.out.println("수상 불가능");
//        }

    }
}
