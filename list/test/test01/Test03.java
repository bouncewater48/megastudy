package list.test.test01;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//    1. id 중복 체크
//    아래와 같이 회원 가입된 id 목록이 주어진다.
//["hagulu", "happy", "google", "bts", "iu", "cuteboy"]
//    id를 입력받고, id가 중복될 경우 "중복입니다", 중복되지 않을 경우 "사용가능"을 출력하세요.
//    입력 예시
//
//    id : hagulu
//    출력 예시
//
//    중복입니다.

        List<String> idList = new ArrayList<>();
        idList.add("hagulu");
        idList.add("happy");
        idList.add("google");
        idList.add("bts");
        idList.add("iu");
        idList.add("cuteboy");
        System.out.println(idList);

        System.out.print("id : ");
        String id = scan.next();

        // 중복여부 확인
       
        if(idList.contains(id)) {
            System.out.print("중복입니다");
        } else {
            System.out.print("사용가능");
        }
        System.out.println();
        scan.close();
       /* boolean isDuplicate = false;
        for(String idCheck : idList) {
            if(id.equals(idCheck)) {
                // id가 중복일 경우 중복여부 true
                isDuplicate = true;
                break;
            }
        }

        if(isDuplicate) {
            System.out.print("중복입니다.");
        } else {
            System.out.print("사용가능.");
        }
        System.out.println(); */


//2. 체조 경기 평균 점수
//    체조 경기에서 아래와 같은 심사위원 점수가 집계되었습니다.
//    최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
//    for문으로 구현할 것
//
//[8, 7, 6, 10, 9, 4]
//    출력 예시
//
//    최고점과 최저점을 제외한 평균 점수는 7.5

        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(8);
        scoreList.add(7);
        scoreList.add(6);
        scoreList.add(10);
        scoreList.add(9);
        scoreList.add(4);

        int minScore = scoreList.get(0);
        int maxScore = scoreList.get(0);
        int sum = 0;

        // 최저점, 최고점 구하기
        // 반복문 사용 x
        scoreList.sort(Comparator.naturalOrder());;
        scoreList.remove(0);
        scoreList.remove(4);
//        System.out.println(scoreList);

        int count = 0;
        for(int score : scoreList) {
            sum += score;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);


        // 반복문 사용 o
//        for (int score : scoreList) {
//            if(score < minScore) minScore = score;
//            if(score > maxScore) maxScore = score;
//        }
//        System.out.println(minScore + "\n" +maxScore);

        // 최저점과 최고점을 제외한 합계 구하고 더할때마다 count 증가
//        int count = 0;
//        for (int score : scoreList) {
//            if(score != minScore && score != maxScore) {
//                sum += score;
//                count++;
//            }
//        }
//        double average = (double) sum / count;
//        System.out.println("최고점과 최저점을 제외한 평균 점수는 " + average);


//            3. 로또 번호
//    Random 클래스를 이용해서 1~45 범위의 6개의 중복되지 않는 숫자를 리스트에 저장하세요.
//    저장된 숫자를 오름차순으로 정렬해서 출력하세요.
//            출력 예시
//
//[3, 6, 19, 26, 37, 44]

        // 1 ~ 45 랜덤함수 생성
        Random random = new Random();
        List<Integer> lottoList = new ArrayList<>();

        while (lottoList.size() < 6) {
            int number = random.nextInt(45) + 1;
            if(!lottoList.contains(number)) {
                lottoList.add(number);
            }
        }

        // 오름차순 정렬
        lottoList.sort(Comparator.naturalOrder());
        System.out.println(lottoList);

//        4. 회원 추가하기
//    회원 관리 리스트를 만든다.
//
//            [우솝, 루피, 상디, 나미, 로빈]
//    새로 입력할 이름을 기존 리스트에 추가한다.
//    만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
//            (새로 입력할 이름들을 다른 리스트에 넣어두고 시작하기)
//
//    프랑키
//            루피
//    쵸파
//            로빈
//    루피
//    출력 예시
//
//[우솝, 루피, 상디, 나미, 로빈, 프랑키, 루피1, 쵸파, 로빈1, 루피2]

        List<String> nameList1 = new ArrayList<>();
        nameList1.add("우솝");
        nameList1.add("루피");
        nameList1.add("상디");
        nameList1.add("나미");
        nameList1.add("로빈");
        System.out.println(nameList1);

        List<String> nameList2 = new ArrayList<>();
        nameList2.add("프랑키");
        nameList2.add("루피");
        nameList2.add("쵸파");
        nameList2.add("로빈");
        nameList2.add("루피");
        System.out.println(nameList2);

        nameList1.addAll(nameList2);
//        if(nameList1.contains(nameList2)) {
//            System.out.println(nameList + "1");
//        }
        System.out.println(nameList1);

    }
}
