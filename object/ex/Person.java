package object.ex;

public class Person { // extends Object { 오브젝트 클래스를 항상 상속받고 있었으나 생략됨

        // 이름, 생년월일
        private String name;
        private String birthday;

        public Person(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public void printInfo() {
            System.out.println("이름 : " + name + "\n생년월일 : " + birthday);
        }

        @Override
        public String toString() {
            return "toString" + "\n이름 : " + name + "\n생년월일 : " + birthday;
        }

}
