package doubleloop.test;

public class Test01_1 {
    public static void main(String[] args) {

//        6. 별찍기 4
//        아래 형태처럼 *을 출력하세요.
//        출력 예시
//
//            *
//           ***
//          *****
//         *******
//        *********

        // 열 선언
        for (int i = 1; i <= 5; i++) {
            int count = 5 - i;
            for (int j = 0; j <= count; j++) {
                System.out.print(" ");
            }
            int count2 = (2 * i) - 1;
            for (int j = 1; j <= count2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
