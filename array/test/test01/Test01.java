package array.test.test01;
// 7. 배열 : 연습문제; 배열 기본 사용법
public class Test01 {
    public static void main(String[] args) {

//        아래 배열을 이용해서 문제를 푸세요.
//                배열의 시작은 0인 것을 유의하세요
        int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
//        1. 배열 값 접근
//        배열의 4번째 값을 6으로 바꾸세요.

        numbers[3] = 6;

//        System.out.println(numbers);

//        2. 배열 출력
//        배열의 값을 순서대로 출력하세요.
//        출력 예시
//
//        3 8 9 6 2 1 7 5

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//        3. 배열 출력
//        배열의 값을 반대 순서(역순)로 출력하세요.
//                출력 예시
//
//        5 7 1 2 6 9 8 3

        // numbers.length - 1 : 배열 최대수에서 -1로 다시 원 배열과 동일하면서 마지막 배열이 나오게 재정렬
        for(int i = numbers.length - 1; i >= 0;  i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

//        4. 배열 출력
//        배열에서 짝수번째 위치에 있는 값들을 출력하세요.
//        출력 예시
//
//        8 6 1 5

        for(int i = 0; i < numbers.length; i++){
            if(i % 2 != 0) {
                // 인덱스는 0부터 시작이라 짝수로 할거면 !=이 맞음
                System.out.print(numbers[i] + " ");
            }
        }
            System.out.println();

//        5. index
//        배열의 값들 중 2가 저장된 index를 출력하세요.
//        출력 예시
//
//        2가 저장된 index : 4

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 2) {
                System.out.print("2가 저장된 index : " + i);
            }
        }
        System.out.println();

//        6. 최대값
//        배열의 값들 중 가장 큰 값을 출력하세요.
//                출력 예시
//
//        가장 큰 값 : 9

        int max = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("가장 큰 값 : " + max);


//        7. 최소값 index
//        배열의 값들 중 가장 작은 수가 저장된 index를 출력하세요.
//                출력 예시
//
//        최소값의 index : 5

//        int min = numbers[0]; // min 변수가 굳이 없어도 그냥 if문에 minIndex를 그대로 넣는게 가능하다
        int minIndex = 0;
        for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i] < min) {
            if(numbers[i] < numbers[minIndex]) {
//                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("최소값의 index : " + minIndex);

//        8. 합계
//        배열의 모든 수의 합을 출력하세요.
//                출력 예시
//
//        값의 합 : 41

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.print("값의 합 : " + sum);


    }
}
