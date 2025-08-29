package doublearray.test;

// 8. 이차원 배열 : 연습문제; 이차원 배열 입력
public class Test01 {
    public static void main(String[] args) {

//        아래 배열은 5명의 10과목 시험 성적을 정리해 놓은 것이다.
//        이 배열을 이용해서 아래 문제를 풀어 보세요.
//
        int[][] scores = {
                {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
                {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
                {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
                {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
                {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
        };

//        1. 학생 별 평균 구하기
//        각 학생의 평균을 각각 구해서 출력하세요.
//        출력
//
//        1번째 학생의 평균 : 89.9
//        2번째 학생의 평균 : 84.8
//        3번째 학생의 평균 : 94.2
//        4번째 학생의 평균 : 78.3
//        5번째 학생의 평균 : 54.8

        for(int i = 0; i < scores.length; i++) {
            // scores[i]
//            {89, 93, 91, 93, 92, 78, 90, 90, 93, 90}
            int sum = 0;
            for(int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = sum / (double) scores[i].length;
            System.out.println((i + 1) + "번째 학생의 평균 : " + average);
        }

//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
//            double average = 0;
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//                average = sum / 10.0;
//            }
//            System.out.println((i + 1) + "번째 학생의 평균 : " + average);
//        }

//        2. 학생 별 최고점 구하기
//        각 학생의 최고 점수를 구해서 출력하세요.
//        출력
//
//        1번째 학생의 최고점 : 93
//        2번째 학생의 최고점 : 98
//        3번째 학생의 최고점 : 98
//        4번째 학생의 최고점 : 100
//        5번째 학생의 최고점 : 67

        System.out.println("=============================");

        for (int i = 0; i < scores.length; i++) {
            // scores[i]
//            int max = 0;
            int max = scores[i][0]; // int max = 0도 문제없으나 좀 더 디테일하게 작성하고 싶으면 scores[i][j]로 작성해도 좋다
            for (int j = 0; j < scores[i].length; j++) {
                if(scores[i][j] > max) {
                    max = scores[i][j];
                }
            }
            System.out.println((i + 1) + "번째 학생의 최고점 : " + max);
        }

//        for (int i = 0; i < scores.length; i++) {
//            int max = 0;
//            for (int j = 0; j < scores[i].length; j++) {
//                if (max < scores[i][j]) {
//                    max = scores[i][j];
//                }
//            }
//            System.out.println((i + 1) + "번째 학생의 최고점 : " + max);
//        }

//        3. 평균 최고점 구하기
//        평균이 가장 높은 학생의 평균 점수와 몇 번째 학생인지 출력하세요.
//        출력
//
//        평균이 가장 높은 학생 : 3번째 학생
//        평균 : 94.2

        System.out.println("=============================");

        double maxAverage = 0;
        int maxIndex = 0;

        for(int i = 0; i < scores.length; i++) {

            int sum = 0;
            for(int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }

            double average = sum / (double) scores[i].length;

            if(average > maxAverage) {
                maxAverage = average;
                maxIndex = i + 1;
            }
        }
        System.out.println("평균이 가장 높은 학생 : " + maxIndex + "번째 학생\n평균 : " + maxAverage);


//        int maxStudent = 0;
//        double maxAverage = 0.0;
//
//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
////            int maxAverage = ;
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//                double average = (double) sum / scores[i].length;
//
//                if (average > maxAverage) {
//                    maxAverage = average;
//                    maxStudent = i + 1;
//                }
//            }
//        }
//        System.out.println("평균이 가장 높은 학생 : " + maxStudent + "번째 학생 \n평균 : " + maxAverage);

//        4. 특정 과목 최고점
//        index 4 과목의 최고 성적의 학생이 몇 번째 학생인지 출력하세요.
//        출력
//
//        index 4 과목의 최고 성적자는 3번째 학생
//        점수 : 97

        System.out.println("=============================");

        int maxScore = 0; // 최고점
        maxIndex = 0;
        for(int i = 0; i < scores.length; i++) {
            //scores[i]
            if(scores[i][4] > maxScore) {
                maxScore = scores[i][4];
                maxIndex = i + 1;
            }
        }
        System.out.println("index 4 과목의 최고 성적자는 " + maxIndex + "번째 학생\n점수 : " + maxScore);

//        int maxScore = 0; // 최고성적
//        int highStudent = 0; //최고성적자 학생
//
//        for (int i = 0; i < scores.length; i++) {
//        scores[i][4]만 확인하면 되므로 j 반복문은 없어도 됨!
//            for (int j = 0; j < scores[i].length; j++) {
//                if (maxScore < scores[i][4]) {
//                    maxScore = scores[i][4];
//                    highStudent = i + 1;
//                }
//            }
//        }
//        System.out.println("index 4 과목의 최고 성적자는 " + highStudent + "번째 학생 \n점수 : " + maxScore);


//        5. 일부 평균 최고점
//        시험 과목 index 3 ~ 7의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
//        출력
//
//        평균이 가장 높은 학생 : 2번 index
//        평균 : 93.8

        System.out.println("=============================");

        maxAverage = 0;
        maxIndex = 0;

        for(int i = 0; i < scores.length; i++) {
            // scores[i]
//            scores[i][3] ~ scores[i][7]
            int sum = 0;
            for(int j = 3; j <= 7; j++) {
                sum += scores[i][j];
            }
            double average = sum / 5.0;

            if(average > maxAverage) {
                maxAverage = average;
                maxIndex = i;
                // 여기선 n번째 학생이 아닌 인덱스이므로 + 1을 하지 말것!
            }
        }
        System.out.println("평균이 가장 높은 학생 : " + maxIndex + "번 index\n평균 : " + maxAverage);

//        int highestStudent = 0;
//        double highestAverage = 0;
//
//        for (int i = 0; i < scores.length; i++) {
//            double sum = 0.0;
//            for (int j = 3; j <= 7; j++) {
//                sum += scores[i][j];
//            }
//            double average = sum / 5.0;
//
//            if (average > highestAverage) {
//                highestAverage = average;
//                highestStudent = i;
//            }
//        }
//
//        System.out.println("평균이 가장 높은 학생 : " + highestStudent + "번 index\n평균 : " + highestAverage);

    }
}
