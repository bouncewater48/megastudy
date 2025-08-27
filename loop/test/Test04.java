package loop.test;

import java.util.Scanner;

// 4. 반복문 : 연습 문제; 고급 문제
public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        1. 알파벳 출력
//        반복문을 이용해서 A ~ Z까지 출력하세요.
//                출력 예시
//
//        A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

        // 컴퓨터에서 문자를 다루기 위한 원리 이해
        // 컴퓨터에서는 모든문자를 0과 1로만 저장함
        // number : 7 = 111 (이진수)
        // Char : A = 065 (십진수 65, 아스키 코드)
        // Char : A = 1000001 (65를 이진수로 변환)

//        for(int i = 65; i <= 90; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        for(int i = 65; i <= 90; i++) {
//            System.out.print((char)i + " "); // (char) : 숫자를 문자처럼 처리해라 라는 명령어
//        }
//        System.out.println();

//        for(char i = 65; i <= 90; i++) { // for문에서 int가 아닌 char로 사용하면 알아서 아스키 코드로 자동변환해줌
//            System.out.print(i + " ");
//        }
//        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++) { // 처음부터 문자열로 변수에 저장하면 자동으로 문자변환을 시켜준다
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n========================================\n");

//        2. 합 구하기
//        수를 입력받아서 1에서부터 그 수까지의 합을 출력하세요.
//        단, 합이 100이 넘으면 합을 중단하고 그때까지의 합을 출력하세요.
//        입력 예시
//
//        수를 입력하세요 : 85
//        출력 예시
//
//        105

//        System.out.println("수를 입력하세요 : ");
//        int number = scan.nextInt();
//
//        int max = 100;
//        for(int i = 1; i <= number; i++) {
//
//        }

//        3. 등차수열
//        1 4 7 10 13 16 19 22 25 ... 은
//        1부터 시작해 이전에 만든 수에 3을 더해 다음 수를 만든 수열이다.
//        이러한 것을 수학에서는 앞뒤 수들의 차이가 같다고 하여
//        등차(차이가 같다의 한문 말) 수열이라고 한다.
//
//        시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때 n번째 수를 출력하세요.
//        입력 예시
//
//        세 개의 수를 입력하세요 : 1 3 10
//        출력 예시
//
//        28


//        4. 소수(prime) 판별
//        소수: 1과 자기 자신 이외에 나누어 떨어지지 않는 수이다.
//
//        수를 입력받고 그 수가 소수(prime)인지 아닌지 출력하세요.
//                입력 예시
//
//        수를 입력하세요 : 73
//        출력 예시
//
//        소수입니다.

        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();
        // 참, 거짓 판별을 위한 불린타입 변수
        boolean isPrimeNumber = true;
        // 2 3 4 5 6 7 8 9 10
        for (int i = 2; i <= Math.sqrt(number); i++) { // number의 제곱근까지 계산가능한 명령어
            if (number % i == 0) {
                isPrimeNumber = false; // 들러온 값이 소수가 아니라면 (false라면) "소수가 아닙니다" 출력
                System.out.println("소수가 아닙니다.");
                break;
            }
        }

        // 들어온 값이 소수가 맞다면 (true라면) "소수입니다" 출력
        if (isPrimeNumber) {
            System.out.println("소수입니다.");
        }

        System.out.print("\n========================================\n");

//        5. 가위 바위 보 대결
//        컴퓨터와 가위 바위 보 게임을 하고 승리 결과를 출력하세요.
//                총 5판 3선승제로 둘 중 하나가 이기면 경기를 끝내고 승리 결과를 출력한다.
//        가위 : 1, 바위 : 2, 보 : 3
//        컴퓨터는 랜덤 클래스를 통해서 게임을 진행한다.
//
//        랜덤 클래스 사용 예시:
//
//        Random rand = new Random();
//
//        int youWin = 0;
//        int computerWin = 0;
//        for (int i = 0; i < 5; i++) {
//            int computerPlay = rand.nextInt(3) + 1;
//            System.out.print("가위(1) 바위(2) 보(3)!! : ");
//            number = scan.nextInt();
//            입출력 예시
//
//            가위(1) 바위(2) 보(3)!! : 2
//            computer : 2 -비겼습니다.
//                    가위(1) 바위(2) 보(3)!! : 2
//            computer : 2 -비겼습니다.
//                    가위(1) 바위(2) 보(3)!! : 3
//            computer : 1 -졌습니다.
//                    가위(1) 바위(2) 보(3)!! : 2
//            computer : 3 -졌습니다.
//                    가위(1) 바위(2) 보(3)!! : 1
//            computer : 1 -비겼습니다.
//                    최종 결과 0:2로 당신의 패배입니다.

    }
}
