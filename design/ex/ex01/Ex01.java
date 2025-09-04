package design.ex.ex01;
// 클래스 설계
public class Ex01 {
    public static void main(String[] args) {
        
        // 사람 정보 관리
        Person me = new Person("강승훈", "19990824");

//        me.name = "20010512";
//        me.birthday = "강승훈";

        me.printInfo();
        
        // 개명
//        me.name = "김진우";
        me.setName("김진우");
        me.printInfo();
        
        // 생년월일만 출력
//        System.out.println(me.birthday);
        System.out.println("생일 : " + me.getBirthday());

    }
}
