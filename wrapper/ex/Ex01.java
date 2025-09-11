package wrapper.ex;

public class Ex01 {
    public static void main(String[] args) {

        // 기본자료형 (primitive type)
        int number1 = 10;
        char alphabet = 'C';
        double grade = 3.2;

        // 기본자료형 데이터를 객체로 다루도록 해주는
        // Wrapper Class
        Integer number2 = 10;
        System.out.println("정수 : " + number2);

        Integer number3 = 10;
        // deprecated : 이거 이제 곧 사라질거니까 대체제로 수정해라!
        Integer number4 = new Integer(10);
        
        // 같은 객체를 가르키는 상태일때는 ==을 통해서 true로 나타날 수는 있으나, 반드시 같다 라는 의미는 아님
        if(number2 == number3) {
            System.out.println("두 값은 같다!!");
        }

        if(number2 == number4) {
            System.out.println("두 값은 같다@@");
        }
        
        // -128 ~ 127 범위를 넘어가면 같은 객체가 아닌 새로운 객체로 취급한다
        Integer number5 = 500;
        Integer number6 = 500;

        if(number5 == number6) {
            System.out.println("두 값은 같다##");
        }

        if(number5.equals(number6)) {
            System.out.println("두 값은 같다$$");
        }

        // 기본자료형이 포함된 연산에서는 기본자료형 기준으로 동작한다.
        // 가능하면 기본자료형을 우선으로 사용하고, 꼭 객체형태의 사용성이 있을때만 래퍼클래스를 사용한다.
        if(number1 == number4) {
            System.out.println("두 값은 같다%%");
        }

    }
}
