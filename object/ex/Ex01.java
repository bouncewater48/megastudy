package object.ex;
// Object 클래스
public class Ex01 {
    public static void main(String[] args) {

        Person me = new Person("강승훈", "20030812");

//        me.printInfo();

        System.out.println(me.toString());
        // object.ex.Person@16b98e56

        System.out.println(me);
        
    }
}
