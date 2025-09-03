package array.ex.ex01;

public class Ex01 {
    public static void main(String[] args) {
        
        // 배열
        // 배열은 정해진 크기를 가진다.
        // 배열은 값들의 순서가 정해진다.
        
        // 다섯명의 시험 성적을 저장
        // 저장할 값이 준비된 경우 초기화
        int[] scores = {90, 95, 100, 85, 70};
        
        // 정수 10개를 저장한 공간 확보
        // 값이 준비되어 있지 않고 초기화
        int[] numbers = new int[10];
        
        // 값 접근
        System.out.println(scores[3]); // 0, 1, 2, 3
        System.out.println(scores[2]); // 0, 1, 2
        System.out.println("네번째 값 : " + scores[3]);
        System.out.println("다섯번째 값 : " + scores[4]);
        System.out.println("두번째 값 : " + scores[1]);
        
        // 배열 수정
        scores[4] = 80;

        int index = 4;
        System.out.println(scores[index]);
        System.out.println(scores[index - 2]);

        // 배열의 모든 값 접근
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//        System.out.println(scores[4]);
        for(int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();




    }
}
