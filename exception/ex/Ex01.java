package exception.ex;

public class Ex01 {
    public static void main(String[] args) {

        String text = null;

        // 뭔가 뭔가 수행
        if(text != null) {
            text.length();
        }

        int[] number = new int[5];

        // try 내에서 오류가 발생할 경우 즉시 그 코드로 이동하고 이후로는 실행이 중단됨.
        try {
            
            // 예외 상황이 발생될 수 있는 코드가 작성
            text.length();

            System.out.println(number[5]);
            
        } catch(NullPointerException e) {
            // 예외 상황이 발생했을때 출력할 문구
            System.out.println("null 인 변수로 메서드 호출 했구만");
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("index 범위가 넘었구만");
            System.out.println(e);
        }

        // 일정시간 동안 프로그램을 멈춘다.
//        millisecond (1/1000) 초
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("sleep 실패!!");
        }

        try {
            printNumber(5);
        } catch (Exception e) {
            System.out.println("잘못된 범위의 값");
        }

        System.out.println("끝!!");
        
    }

    
    // 1과 10 사이의 수를 하나 전달 받고 출력하는 기능
    public static void printNumber(int number) throws Exception{
        
        // 1과 10 사이의 수가 아니면 exception 발생
        if(number < 1 || number > 10) {
            throw new Exception();
        }

        System.out.println(number);
    }
    
}
