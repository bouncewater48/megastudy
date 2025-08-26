package variable.ex;
// 변수2
public class Ex02 {
    public static void main(String[] args) {
        // 문자 저장
        // 퀴즈의 정답은 O 입니다.
        char answer = 'O';
        System.out.println("퀴즈의 정답은 " + answer + "입니다.");
        System.out.println();

        // 소수 (실수) 저장
        // 원주율 3.14
        double pi = 3.14;
        System.out.println("원주율 " + pi);

        // 형 변환 (casting)
        // double -> int
        int intPi = (int)pi;
        System.out.println(intPi);
        System.out.println();

        // int -> double
        double doublePi = intPi;
        System.out.println(doublePi);
//       이미 3.14가 정수형태로 변환되면서 .14가 사라졌으므로 다시 실수형으로 형변환해도 .14가 살아나지 않고 .0으로 붙는다
        System.out.println();

        // 평균 구하기
        int score1 = 95;
        int score2 = 100;
//        double average = (score1 + score2) / (double)2;
        double average = (score1 + score2) / 2.0;
//      / 2 앞에 (double)을 붙여서 정수형이 아닌 실수형으로 취급하게 바꿀 수 있다(형변환)

        System.out.println("평균 : " + average);

    }
}
