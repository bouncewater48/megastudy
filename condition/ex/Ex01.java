package condition.ex;

public class Ex01 {
    public static void main(String[] args) {
        // 몸무게가 70kg이 안된다면 치킨 먹어야지
        // 만약 몸무게가 70 이하라면 치킨 먹어야지

        // 조건 : 몸무게가 70 이하
        // 실행문 : 치킨 먹자

        int weight = 67;

        if(weight <= 70){
            // 들여쓰기, 인덴트(indent), 뎁스
            System.out.println("치킨 먹자");
        }//else{
//            System.out.println("치킨은 못 먹겠네");
//        }

        // 몸무게가 80 초과면 다이어트 시작
        if(weight > 80){
            System.out.println("다이어트 시작!");
        }

        // 몸무게가 60 이하면 폭식!
        if(weight <= 60){
            System.out.println("폭식!!");
        }

        // 몸무게가 68이면 목표 달성
        if(weight == 68){
            System.out.println("목표 달성!!!");
        }

        // 몸무게가 72가 아니면 72 아니다!
        if(weight != 72){
            System.out.println("몸무게가 72가 아니야!");
        }

        // if에 따라오는 ()에는 true, false 값만 위치할 수 있다
        if(true) {
            System.out.println("true");
        }

        System.out.println(3 + 5);
        System.out.println(weight <= 70);

//        boolean result = true;
        boolean result = false;
        result = weight > 80;

        if(result) {
            System.out.println("result가 true 다!");
        }


    }
}
