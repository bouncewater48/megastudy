package oop.test.test01;
// 클래스 : 연습문제; Class 속성
public class Test01 {
    public static void main(String[] args) {

//        1. 핸드폰 객체
//        핸드폰 Class를 설계하세요.
//                멤버 변수는 아래를 참조하세요.
//                제조사, 모델 명, 전화번호
//
//        설계된 Class를 기반으로 두 개의 객체를 생성하여 값을 저장 후 출력하세요.
//                멤버 변수에 저장할 값은 자유롭게 작성하세요.
//                출력 예시
//
//        갤럭시ZFlip3 (samsung) : 010-1234-5678
//
//        iPhone16 (apple) : 010-9876-5432

//        String company;
//        String model;
//        String phoneNum;

        Phone samsung = new Phone();
        samsung.company = "samsung";
        samsung.model = "갤럭시ZFlip3";
        samsung.phoneNum = "010-1234-5678";

        Phone apple = new Phone();
        apple.company = "apple";
        apple.model = "iPhone16";
        apple.phoneNum = "010-9876-5432";

        System.out.println(samsung.model + " (" + samsung.company + ") : " + samsung.phoneNum);
        System.out.println(apple.model + " (" + apple.company + ") : " + apple.phoneNum);


//        2. 학생 명단
//        학생 Class를 설계하세요.
//                멤버 변수는 아래를 참조하세요.
//                이름, 수업 명, 나이, 전화번호
//
//        설계된 Class를 기반으로 두 개의 객체를 생성하여 값을 저장 후 출력하세요.
//                멤버 변수에 저장할 값은 자유롭게 작성하세요.
//                출력 예시
//
//        유재석 (21) 수업 : Java, 연락처 : 010-0000-1111
//
//        이효리 (23) 수업 : 웹 개발, 연락처 : 010-9999-2222


        System.out.println("=============================");

//        String name;
//        String Class;
//        int age;
//        String phoneNum;

        Student Jeasuk = new Student();
        Jeasuk.name = "유재석";
        Jeasuk.Class = "Java";
        Jeasuk.age = 21;
        Jeasuk.phoneNum = "010-0000-1111";

        Student Hyori = new Student();
        Hyori.name = "이효리";
        Hyori.Class = "웹 개발";
        Hyori.age = 23;
        Hyori.phoneNum = "010-9999-2222";

        System.out.println(Jeasuk.name + " (" + Jeasuk.age + ") 수업 : " + Jeasuk.Class + ", 연락처 : " + Jeasuk.phoneNum);
        System.out.println(Hyori.name + " (" + Hyori.age + ") 수업 : " + Hyori.Class + ", 연락처 : " + Hyori.phoneNum);

//        두 객체를 배열에 저장하여 반복문을 통해서 출력하세요. (option)

        System.out.println("=============================");

//        Student[] students = new Student[2];
        Student[] students = {Jeasuk, Hyori};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "(" + students[i].age + ") 수업 : " // students[i] 자체가 객체이므로 .name으로 이름을 가져옴
                    + students[i].Class + ", 연락처 : " + students[i].phoneNum);
        }

//        String[][] students = {
//                {"유재석", "21", "Java", "010-0000-1111"},
//                {"이효리", "23", "웹 개발", "010-9999-2222"}
//        };
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(
//                    students[i][0] + " (" + students[i][1] + ") 수업 : " +
//                            students[i][2] + ", 연락처 : " + students[i][3]
//            );
//        }



    }
}
