package string.ex;
// 문자열; 문자열 함수
public class Ex03 {
    public static void main(String[] args) {

        String text = "Hello";

        // 문자열 변수
        // 저장하고 있는 대상의 갮, 값을 기반으로 수행하는 기능(메서드)까지 포함하고 있다

        // 문자열의 길이
        int length = text.length();

        System.out.println(length);
        System.out.println(text + "의 길이는 " + text.length());
        
        // 특정 위치의 문자 구하기
        char alphabet = text.charAt(1);
        System.out.println(alphabet);
        
        // 문자를 통해서 문자열을 출력
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
        }
        System.out.println();

    }
}
