package doublearray.test;

// 8. 이차원 배열 : 연습문제; 이차원 배열 입력
public class Test02 {
    public static void main(String[] args) {

//        1. 10 입력하기
//                [2][3] 크기의 배열을 만드세요.
//                반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
//                출력
//
//        10 10 10
//        10 10 10

        int[][] number = new int[2][3];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                number[i][j] = 10;
            }
        }

        for (int i = 0; i < number.length; i++) {
            // numbers[i]
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

//        2. 순서대로 입력하기
//[3][4] 크기의 배열을 만드세요.
//                반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장하고 출력하세요.
//                출력
//
//        1 2 3 4
//        1 2 3 4
//        1 2 3 4

        System.out.println("=============================");

        int[][] number2 = new int[3][4];

        for (int i = 0; i < number2.length; i++) {
            for (int j = 0; j < number2[i].length; j++) {
                number2[i][j] = j + 1;
                System.out.print(number2[i][j] + " ");
            }
            System.out.println();
        }

//        3. 배열 별로 입력하기
//                [3][3] 크기의 배열을 만드세요.
//                반복문을 이용해서, 첫 배열은 1, 두 번째 배열은 2, 세 번째 배열은 3으로 채우고 출력하세요.
//                출력
//
//        1 1 1
//        2 2 2
//        3 3 3

        System.out.println("=============================");

        int[][] number3 = new int[3][3];

        for (int i = 0; i < number3.length; i++) {
            for (int j = 0; j < number3[i].length; j++) {
                number3[i][j] = i + 1;
                System.out.print(number3[i][j] + " ");
            }
            System.out.println();
        }


//        4. +자 그리기
//                [5][5] 크기의 배열을 만드세요.
//                반복문을 이용해서, 아래와 같이 + 위치에 1을 입력하고 출력하세요.
//                출력
//
//        0 0 1 0 0
//        0 0 1 0 0
//        1 1 1 1 1
//        0 0 1 0 0
//        0 0 1 0 0

        System.out.println("=============================");

        int[][] number4 = new int[5][5];

//        for(int i = 0; i < number4.length; i++) {
//            for(int j = 0; j < number4[i].length; j++) {
//                if(number4[i] || number4[j]){
//
//                }
//            }
//        }



        for (int i = 0; i < number4.length; i++) {
            for (int j = 0; j < number4[i].length; j++) {
                number4[i][2] = 1;
                number4[2][j] = 1;
                System.out.print(number4[i][j] + " ");
            }
            System.out.println();
        }


//        5. 전체 수 입력
//                [3][3] 크기의 배열을 만드세요.
//                반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력하세요.
//        출력
//
//        1 2 3
//        4 5 6
//        7 8 9

        System.out.println("=============================");

        int[][] number5 = new int[3][3];

        int numbers = 1;
        for (int i = 0; i < number5.length; i++) {
            for (int j = 0; j < number5[i].length; j++) {
                number5[i][j] = numbers;
                numbers++;
//                number5[i][j] = j + 1 + (i * 3);
//                number5[0][j] = j + 1;
//                number5[1][j] = 4 + j;
//                number5[2][j] = 7 + j;
                System.out.print(number5[i][j] + " ");
            }
            System.out.println();
        }


//        6. 전체 수 입력
//                [3][3] 크기의 배열을 만드세요.
//                반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력하세요.
//        출력
//
//        1 4 7
//        2 5 8
//        3 6 9


        System.out.println("=============================");

        int[][] number6 = new int[3][3];

        for (int i = 0; i < number6.length; i++) {
            for (int j = 0; j < number6[i].length; j++) {
                // j : 0 1 2
                //     0 3 6
                number6[i][j] = i + 1 + (j * 3);
//                number6[j][i] = numbers;
//                numbers++;
                // 00 01 02 10 11 12 20 21 22
                // 00 10 20 01 11 21 02 12 22

                System.out.print(number6[i][j] + " ");
            }
            System.out.println();
        }


//        for (int i = 0; i < number6.length; i++) {
//            for (int j = 0; j < number6[i].length; j++) {
//                number6[i][0] = i + 1;
//                number6[i][1] = 4 + i;
//                number6[i][2] = 7 + i;
//                System.out.print(number6[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}
