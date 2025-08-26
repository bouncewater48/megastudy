package loop.ex;
// 4.반복문
public class Ex01 {
    public static void main(String[] args) {

        // 몸무게가 70 이상일 동안 운동을 한다.
        int weight = 75;

        while(weight > 70){
            System.out.println(weight + " 으쌰으쌰!!");
            weight -= 2; // 복합 대입 연산자 // weight = weight - 2;
        }

        // Hello World를 5번 출력
        // 0 1 2 3 4
        int i = 0;
        while(i < 5) {
            System.out.println(i + " Hello World");
            i++; // 증감연산자 // i += 1; // i = i + 1;
        }

        // 1 2 3 4 5
        i = 1;
        while(i <= 5) {
            System.out.println(i);
            i++;
        }

        // 5 4 3 2 1
        i = 5;
        while(i >= 1) {
            System.out.println(i);
            i--;
        }

        // 1 ~ 10까지의 합

        int sum = 0;
        i = 1;
        while(i <= 10) {

            sum = sum + i;
//            System.out.println(i);
            i++;
        }
        System.out.println("1 ~ 10까지의 합 : " + sum);

//        i = 1;
//        int result = 0;
//        while(i <= 10) {
//            result += i;
////            System.out.println(i);
//            i++;
//        }
//        System.out.println(result);
        
        // 무한 반복, 무한 루프
        // 컴퓨터 사양이나 프로그램 사양에 따라서 먹통이 되는 경우도 있으므로 절대 함부로 사용하지 말것 !!
        // 의도적으로 무한루프를 실행시키는 경우에는 문제가 없음
//        while(true) {
//            System.out.println("Hello");
//        }

    }
}
