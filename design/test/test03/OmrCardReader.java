package design.test.test03;

public class OmrCardReader {

    // 정답
    private int[] answer = new int[5];

    public void setAnswer(int answer1, int answer2, int answer3, int answer4, int answer5) {
        answer[0] = answer1;
        answer[1] = answer2;
        answer[2] = answer3;
        answer[3] = answer4;
        answer[4] = answer5;
    }

    public void printInfo() {
        System.out.print("정답      : ");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }

    // 채점 기능
    // OmrCard에서 정답을 받아와야함, omr로 지정
//    OmrCard omr = new OmrCard("강승훈","123456789");

    // 해당하는 객체의 클래스 타입으로 저장 시 사용가능
    public int checkScore(OmrCard card) {
        int score = 0;
        int[] marking = card.getMarking();
        for (int i = 0; i < answer.length; i++) {
            if (card.getMarking()[i] == answer[i]) {
                //    score += 20;
                score += 100 / answer.length;
                // 100점 만점을 기준으로 점수 배정
            }
        }
//        System.out.println("점수 : " + score);
        return score;
    }
    
    // 채점 결과 출력 기능
    public void printScore(OmrCard card) {
        int score = checkScore(card);
        card.printStudentInfo();
        System.out.println("점수 : " + score);
    }
    
}
