package doublearray.ex;

// 8. 이차원 배열
public class Ex01 {
    public static void main(String[] args) {

        // 3명의 학생의 5개의 성적 정보

        int[][] scores = {
        // 배열은 항상 0부터 시작하는거 생각하기
                {90, 80, 95, 85, 100},
                {60, 55, 70, 80, 45},
                {100, 30, 60, 90, 70}
        };

        System.out.println("첫 번째 학생의 세번째 점수 : " + scores[0][2]);
        System.out.println("세 번째 학생의 두번째 점수 : " + scores[2][1]);
        System.out.println("두 번째 학생의 다섯번째 점수 : " + scores[1][4]);

        // 이차원 배열의 모든 값 접근

        // 모든 배열에 접근
        for(int i = 0; i < scores.length; i++) {
//            scores[i]
//            {90, 80, 95, 85, 100}
            for(int j = 0; j < scores[i].length; j++) {
//                scores[i][j]
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();

        }

        // 학생별 점수 합계
        for(int i = 0; i < scores.length; i++) {
//            scores[i]
//            {90, 80, 95, 85, 100}
            int sum = 0;
            for(int j = 0; j < scores[i].length; j++) {
//                scores[i][j]
                sum += scores[i][j];
            }
            System.out.println("학생별 점수 합계 : " + sum);
        }

    }
}
