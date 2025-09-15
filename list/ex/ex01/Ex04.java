package list.ex.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {

        List<Member> memberList = new ArrayList<>();

        Member member1 = new Member("강승훈", "01011112222");
        memberList.add(member1);

        memberList.add(new Member("유재석", "01012345678"));
        memberList.add(new Member("강호동", "01098765432"));
        memberList.add(new Member("유재석", "01000009999"));

        System.out.println(memberList);
        
        // 두번째 저장된 객체 이름 출력
        Member secondMember =  memberList.get(1);
        String name = secondMember.getName(); // 코드 여러줄을 이어붙히는건 좋은 코드 구조가 아님.
        System.out.println("두번째 이름 : " + name);

        // 모든 멤버 이름 출력
        // 1. 모든 멤버의 객체를 얻어오기
        for(int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
        // 2. 멤버의 이름만 얻어오기
            name = member.getName(); // 위에 name이 있으니 그대로 재사용
            System.out.print(name + " ");
        }
        System.out.println();

        // 향상된 for문
        for(Member member : memberList) {
            name = member.getName(); // 헷갈리지 않게 게터로 가져온 이름을 변수에 저장
            System.out.print(name + " ");
        }
        System.out.println();

        // 유재석(5678) / 회원 이름과 전화번호 끝 4자리로 확인하기
        Iterator<Member> iter = memberList.iterator();
        // 객체를 얻어오기
        while(iter.hasNext()) {
            Member member = iter.next();
        // member 객체의 이름만 얻어오기
            name = member.getName();
        // member 변수의 전화번호만 얻어오기
            String phoneNumber = member.getPhoneNumber();
        // 이름과 전화번호 뒷 4자리만 받아오기 / substring 사용
            int length = phoneNumber.length();
            String part = phoneNumber.substring(length - 4);
            System.out.println(name + "(" + part + ")");
//            강승훈(2222)
//            유재석(5678)
//            강호동(5432)
//            유재석(9999)
        }

    }
}
