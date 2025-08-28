package function.test;

import java.util.Scanner;

// 6. 함수: 연습문제; 함수 만들기 응용
public class Test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        2. 소수(prime) 판별
//        소수: 1과 자기 자신 이외에 나누어 떨어지지 않는 수이다.
//
//        수를 입력받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
//        소수이면 true, 소수가 아니면 false를 리턴하세요.
//                단, 입력하는 수는 2 이상이어야 합니다.
//        입력 예시
//
//        수를 입력하세요 : 22
//        출력 예시
//
//        false

        System.out.print("수를 입력하세요 : ");
        int number = scan.nextInt();

        System.out.println(isPrimeNumber(number));

        if(isPrimeNumber(number)) {
            System.out.println("소수 입니다");
        } else {
            System.out.println("소수가 아닙니다");
        }

    }

//        수를 입력받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
    public static boolean isPrimeNumber(int number) {
//        boolean isPrimeNumber = true; // < false를 리턴하는것만 있어도 판별이 가능하므로 필요없다
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
//                isPrimeNumber = false;
                return false;
            }
        }
        return true;
//        return isPrimeNumber;
    }

}
