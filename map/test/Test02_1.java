package map.test;

import java.util.*;

public class Test02_1 {
    public static final Map<String, String> capitalMap = new HashMap<>() {
        //        2. 수도 맞추기 게임
//        랜덤으로 뽑힌 나라의 수도 이름을 맞추는 게임
//        나라-수도가 들어있는 20개의 쌍이 Map으로 주어진다.
//        이 중 랜덤으로 5개의 문제가 주어지고, 사용자로부터 나라에 해당하는 수도를 입력받는다.
//        정답인지 아닌지 수도를 입력한 즉시 출력한다.
//        모두 풀고 나면 점수(100점 만점)가 출력된다.
//
//        아래 코드를 이용해서 문제를 푸세요.

        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("튀르키예", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        ArrayList<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것

        int score = 0;

        // 랜덤 변수 5개
        int first_randomIndex = rand.nextInt(keyList.size());
        int second_randomIndex = rand.nextInt(keyList.size());
        int third_randomIndex = rand.nextInt(keyList.size());
        int fourth_randomIndex = rand.nextInt(keyList.size());
        int fifth_randomIndex = rand.nextInt(keyList.size());

        // 랜덤 나라 5개
        String country1 = keyList.get(first_randomIndex);
        String country2 = keyList.get(second_randomIndex);
        String country3 = keyList.get(third_randomIndex);
        String country4 = keyList.get(fourth_randomIndex);
        String country5 = keyList.get(fifth_randomIndex);

        // 정답 5개
//        String answer1 = scan.nextLine();
//        String answer2 = scan.nextLine();
//        String answer3 = scan.nextLine();
//        String answer4 = scan.nextLine();
//        String answer5 = scan.nextLine();
        
        // 문제 5개
//        System.out.println(country1 + "의 수도 이름은?");
//        String answer1 = scan.nextLine();
//        System.out.println(country2 + "의 수도 이름은?");
//        String answer2 = scan.nextLine();
//        System.out.println(country3 + "의 수도 이름은?");
//        String answer3 = scan.nextLine();
//        System.out.println(country4 + "의 수도 이름은?");
//        String answer4 = scan.nextLine();
//        System.out.println(country5 + "의 수도 이름은?");
//        String answer5 = scan.nextLine();

        // 정답 확인
        System.out.print(country1 + "의 수도 이름은?");
        String answer1 = scan.nextLine();
        if(answer1.equals(capitalMap.get(country1))) {
            System.out.print("정답");
            score += 20;
        } else {
            System.out.print("틀렸습니다");
        }
        System.out.println();

        System.out.print(country2 + "의 수도 이름은?");
        String answer2 = scan.nextLine();
        if(answer2.equals(capitalMap.get(country2))) {
            System.out.print("정답");
            score += 20;
        } else {
            System.out.print("틀렸습니다");
        }
        System.out.println();

        System.out.print(country3 + "의 수도 이름은?");
        String answer3 = scan.nextLine();
        if(answer3.equals(capitalMap.get(country3))) {
            System.out.print("정답");
            score += 20;
        } else {
            System.out.print("틀렸습니다");
        }
        System.out.println();

        System.out.print(country4 + "의 수도 이름은?");
        String answer4 = scan.nextLine();
        if(answer4.equals(capitalMap.get(country4))) {
            System.out.print("정답");
            score += 20;
        } else {
            System.out.print("틀렸습니다");
        }
        System.out.println();

        System.out.print(country5 + "의 수도 이름은?");
        String answer5 = scan.nextLine();
        if(answer5.equals(capitalMap.get(country5))) {
            System.out.print("정답");
            score += 20;
        } else {
            System.out.print("틀렸습니다");
        }
        System.out.println();

        System.out.print("총 점수는 " + score + "점");

//        String key1 = keyList.get(first_randomIndex);
//        System.out.println(key1);
//        System.out.println(first_randomIndex + "의 수도 이름은?");

//        for (int i = 0; i < 5; i++) {
//            for (String key : keys) {
//                String value = capitalMap.get(key);
//            System.out.print(key);
//            }
//            System.out.println(key + "의 수도 이름은?");
//        }


//        출력 예시
//
//        튀르키예의 수도 이름은? 앙카라
//        정답
//        이란의 수도 이름은? 테헤란
//        정답
//        스위스의 수도 이름은? 몰라
//        틀렸습니다.
//                이집트의 수도 이름은? ..
//        틀렸습니다.
//                독일의 수도 이름은? 베를린
//                정답
//        총 점수는 60
    }
}