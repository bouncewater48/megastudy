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

        // 문자열 자르기
        // 전화번호 중 일부만 문자열로 뜯어내기
        String phoneNumber = "01012345678";

        // 중간 번호 얻어내기
        // substring : 잘린 결과를 리턴하는게 아닌 잘라낸걸 리턴
        String part = phoneNumber.substring(3, 7);
        // index에서 3번부터 6번 자리까지를 잘라내어 얻어냄, 잘라낼 위치의 인덱스 자리 +1로 작성해야 정확한 결과가 얻어짐
        System.out.println(part);

        // 마지막 4자리 얻어내기
        System.out.println(phoneNumber.substring(7, 11)); // 4자리는 +4로 계산하면 편함!
        // substing도 그대로 sout에 넣어서 출력가능!

        // 특정 문자열로 시작, 끝나는지 확인
        String name = "강승훈";
        // 강씨인지 확인
        // "강"으로 시작하는지
        if(name.startsWith("강")) {
            System.out.println("김씨 맞구나!");
        }

        // 이름이 승훈인지 확인
        // "승훈"으로 끝나는지
        if(name.endsWith("승훈")) {
            System.out.println("승훈 맞구나?");
        }

        // 문자열 일부 바꾸기
        // 승훈 -> 진우
        // 치환
        String newName = name.replace("승훈", "진우");
        System.out.println("바뀐 이름 : " + newName);
        System.out.println("기존 이름 : " + name);
        name = name.replace("승훈", "진우");
        System.out.println(name);

        // 문자열 쪼개기
        String memberNames = "강승훈,유재석,하하,황광희,조세호";

        // 사람이름 뒤에 님 붙여서 출력
        // 특정한 문자열을 기준으로 문자열을 쪼개는 기능
//        memberNames.split(",");
//        String[] names = memberNames.split(",");
        String[] names = memberNames.split(",");

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " 님");
        }
//        강승훈 님
//        유재석 님
//        하하 님
//        황광희 님
//        조세호 님


    }
}
