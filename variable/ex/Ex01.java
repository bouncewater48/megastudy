package variable.ex;
// 변수1
public class Ex01 {
    public static void main(String[] args) {

        // 한줄 주석

        /*
        * 여러 줄
        *  주석
        * */

        // 변수 만들기
        // 츄파춥스 가격은 250원
//      변수 선언 및 초기화
        int candy = 250;
        System.out.println(candy);

        System.out.println("츄파춥스 가격은 " + candy + "원");
        
//      "츄파춥스" 가격 : 250원
//       \" : 결과창에 "(쌍따옴표) 표기
        System.out.println("\"츄파춥스\" 가격 : " + candy + "원");

//       츄파춥스 3개의 가격
        int total = candy * 3;
        System.out.println("츄파춥스 3개의 가격 : " + total + "원");

//      츄파춥스 가격 100원 인상
        candy = candy + 100;
        total = candy * 3;

        System.out.println("츄파춥스 가격 100원 인상 : " + candy + "원");
        System.out.println("츄파춥스 3개의 가격 : " + total + "원");

//      3000원을 가지고 츄파춥스를 최대 몇개를 살 수 있을까?
        int money = 3000;
        int count = money / candy;

        System.out.println("츄파춥스 최대 개수 : " + count + "개");

//      최대로 사고 나서 거스름 돈
//        int change = money - (candy * count);
        int change = money % candy;

        System.out.println("거스름 돈 : " + change + "원" );



    }
}
