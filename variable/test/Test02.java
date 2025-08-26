package variable.test;

public class Test02 {
    public static void main(String[] args) {
        int gradeA = 90;
        char agrade = 'A';
        double arate = 4.0;
        int gradeB = 80;
        char bgrade = 'B';
        double brate = 3.0;

//        1. 변수 출력
//        아래 문장을 변수를 사용하여 출력하세요.
//                시험 성적이 90점 이상이면 A학점이고 평점은 4.0입니다.
//                시험 성적이 80점 이상이면 B학점이고 평점은 3.0입니다.

        System.out.println("시험 성적이 " + gradeA + "점 이상이면 " + agrade + "학점이고 평점은 " + arate + "입니다.");
        System.out.println("시험 성적이 " + gradeB + "점 이상이면 " + bgrade + "학점이고 평점은 " + brate + "입니다.");
        System.out.println();


//        int score = 90;
//        char grade = 'A';
//        double point = 4.0;
//
//        System.out.println("시험 성적이 " + score + "점 이상이면 " + grade + "학점이고 평점은 " + point + "입니다.");
//
//        int score = 80;
//        char grade = 'B';
//        double point = 3.0;
//
//        System.out.println("시험 성적이 " + score + "점 이상이면 " + grade + "학점이고 평점은 " + point + "입니다.");

//        2. 실수 연산
//        아래 정수와 실수를 곱해서 출력하세요.
//        int number1 = 33;
//        double number2 = 35.325;
//
//        두 수의 곱 : 1165.7250000000001

        int number1 = 33;
        double number2 = 35.325;
        System.out.println("두 수의 곱 : " + number1 * number2);
        System.out.println();

//        3. 날짜 구하기
//        943시간은 며칠인지 구하여 출력하세요.
//        943시간은 39일입니다.

        int time = 943;
        int date = time / 24;
        System.out.println(time + "시간은 " + date + "일 입니다.");
        System.out.println();

//        4. 도형 넓이 구하기
//        가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//                넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요.
//                사각형의 넓이 : 72
//        삼각형의 넓이 : 36.0

        int width = 8;
        int height = 9;
        System.out.println("사각형의 넓이 : " + (width * height));
//        System.out.println("삼각형의 넓이 : " + (width * height) / 2.0);
        double area = width * height / 2.0;
        System.out.println("삼각형의 넓이 : " + area);
//      double 타입 변수를 미리 지정하고 사용하는것도 가능!
        System.out.println();

//        5. 평균 구하기
//        아래와 같이 점수가 주어졌을 때 평균을 구해서 출력하세요.
//        국어 : 93, 수학 : 88, 영어 : 94
//        국어 93점, 수학 88점, 영어 94점
//        평균 : 91.66666666666667

//      가급적이면 변수명은 단축어 말고 풀네임으로 작성하는 습관 들이기
        int korean = 93;
        int math = 88;
        int english = 94;
//      문제에서는 각 점수들을 실수형이 아닌 정수형으로 나타내라 했으므로 double을 여기 사용하지 말고 실수형으로 나눌것!
        System.out.println("국어 " + korean + "점, " + "수학 " + math + "점, " + "영어 " + english + "점");
        System.out.println("평균 : " + (korean + math + english) / 3.0);
        System.out.println();

//        6. 화씨 구하기
//        아래 공식을 이용해서 섭씨 30도의 화씨 온도를 출력하세요.
//        화씨 온도 = 9 / 5 * 섭씨 온도 + 32
//
//        섭씨 30도는 화씨 86.0도입니다.

//      변수명은 항상 대문자가 아닌 소문자로만 이루어지게 작성하기! Celsius -> celsius / Fahrenheit -> fahrenheit
        int celsius = 30;
        double fahrenheit = (double) 9 / 5 * celsius + 32;
    //  double Fahrenheit = 9 / 5 * Celsius + 32;
//      이 상태로 구하면 9 / 5 * Celsius가 Celsius 단일로 작성한거로 인식해서 이 전체를 30으로 인식 후 계산함, 반드시 앞에 (double)을 붙힐 것!
//      주석으로 바꾼 식으로 계산시 62.0도로 출력된다
//        9 / 5 * Celsius 는 9 / 5를 정수 / 정수 로 인식하여 몫 1로 계산하기때문에 62.0도가 출력되는것! 앞에 (double)을 붙히면 해결되는 문제이다
        System.out.println("섭씨 " + celsius + "도는 화씨 " + fahrenheit + "도 입니다.");
    }
}
