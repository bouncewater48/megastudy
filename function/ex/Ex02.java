package function.ex;

// 6. 함수
// main도 함수이기에 함수 안에 함수를 만드는 것은 불가능, 따라서 main 영역 밖에서 함수를 만들어야한다
public class Ex02 {
    public static void main(String[] args) {

        int price = getCandyPrice(5); // 앞에 count는 직접 작성한게 아니고, 숫자를 적으면 알아서 적혀진다!

        System.out.println("가격 : " + price);

        int number1 = 20;
        int number2 = 40;

        System.out.println("더한 결과 : " + addNumbers(number1, number2));

        // 1 ~ 10 까지 합을 구하기
        int sum = 0;
        for(int i = 1; i  <= 10; i++) {
            sum += i;
        }
//        System.out.println("1부터 10까지의 합 : " + sum);
        System.out.println("1부터 10까지의 합 : " + addNumbers(number1, number2));
        System.out.println("합 : " + addNumbersAll(10));

        int result = addNumbersAll(10);
        System.out.println("총합 : " + addNumbersAll(10));

        addNumbersAll(10);
//        printAddNumbers(15);
//        printAddNumbers();
    }
    
    // 1부터 전달받은 값까지의 합을 리턴하는 기능
    public static int addNumbersAll(int number){

        int sum = 0;
        for(int i = 1; i  <= number; i++) {
            sum += i;
        }
        return sum;
    }
    
//    // 1부터 전달받은 값까지의 합을 구해서 출력하는 기능
//    public static int printAddNumbers(int number){
//
//        int sum = 0;
//        for(int i = 1; i  <= number; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 " + number +  "까지의 합 : " + sum);
//    }

/*
    // 1부터 10까지의 합을 출력하는 함수 기능
    public static void printAddNumbers(){
        // 1 ~ 10 까지 합을 구하기
        int sum = 0;
        for(int i = 1; i  <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }
*/
    // 두개의 수를 더하는 기능
    // parameter 값에는 같은 변수형태가 아닌 다른 형태(int, char)도 가능하다
    public static int addNumbers(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    // 개수에 따른 츄파춥스 가격을 계산하는 기능
    // 전달할 값이 있다면,() 안에 전달할 값을 지정해줘야함
    public static int getCandyPrice(int count) {
        int result = 250 * count;
        return result;
    }
}
