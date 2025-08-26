package variable.ex;

import java.util.Scanner;
// java.util 패키지에서 Scanner 클래스를 상속받아서 사용하겠다는 뜻, 상속받지 않으면 사용이 불가능하다!
// 이 기능을 기본 기능으로 넣게 되면 용량이 불필요하게 커지므로, 그래서 필요할때만 상속을 받아 사용한다

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//       입력메소드 작성, 이 메소드가 있어야 입력부분을 구현하는게 가능!
//       scan.nextInt() : 변수값을 특정 고정값으로 사용하는게 아닌 사용자에게 입력받아서 사용하겠다 라는 선언
//       콘솔창에 원하는 값을 입력하여 변수값을 저장 할 수 있다

        // 츄파춥스 가격을 입력 받고
        // 3개의 가격을 출력하는 기능
        
        System.out.println("츄파춥스 가격을 입력하세요 : ");
        int candy = scan.nextInt();

        int total = candy * 3;

        System.out.println("츄파춥스 3개의 가격 : " + total + "원");
        
//        츄파춥스 가격과 개수를 입력 받고
//        가격을 출력하는 기능

        // 1. 가격과 개수를 따로 입력하기
//        System.out.println("츄파춥스 가격을 입력하세요");
//        candy = scan.nextInt();
//        System.out.println("개수를 입력하세요");
//        int count = scan.nextInt();

        // 2. 가격과 개수를 동시에 입력하기
        System.out.println("츄파춥스 가격과 개수를 입력하세요");
        candy = scan.nextInt();
        int count = scan.nextInt();

        System.out.println("츄파춥스 " + count + "개의 가격은 " + (candy * count) + "원 입니다.");
/*
츄파춥스 가격과 개수를 입력하세요
330 55
츄파춥스 55개의 가격은 18150원 입니다.
*/
    }
}
