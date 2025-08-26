package loop.ex;
// 반복문 for문
public class Ex02 {
    public static void main(String[] args) {
        // 횟수 반복 5번
        for(int i = 0; i < 5; i++ ){
            System.out.println("Hello World!");
        }
        
        // 1 2 3 4 5 6
        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            // 지역 변수
            int number = 10;
        }
        System.out.println();

        System.out.println("Hello!");

        // 5 4 3 2 1
        for(int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
        System.out.println();

        int weight = 75;
        // 몸무게를 다루는 무언가
        // 몸무게가 70kg 이 될때까지
        for(; weight >= 70; weight -= 2) {
            System.out.println("으쌰으쌰");
        }

        // for문을 통한 무한 반복
//        for(;;) { 
//            System.out.println("Hello");
//        }

        int count = 0;

        //break
        while(true) {

            if(count == 10) {
                break;
            }

            System.out.println("Hello");

            count += 2;

            //continue

            for(int i = 1; i <= 10; i++) {
                System.out.println(i + " ");
            }

        }

    }
}
