package interfaces.test.test01;

public class Test01 {

//    1. 오디션 지원
//    오디션에 지원할 수 있는지 자격 확인하는 프로그램
//
//    지망생(EntertainerApplicant)
//    기획사(JypEntertainment)에서 연기자 오디션(actorAudition)과 아이돌 오디션(idolAudition)을 모집한다.
//    연기자 오디션에서는 연기 능력(Act)을 보고, 아이돌 오디션에서는 노래 능력(Sing)을 본다.
//    지망생이 두 오디션에 모두 지원 가능하도록 인터페이스로 구현하세요.

    public static void main(String[] args) {


        // 기획사
        JypEntertainment jyp = new JypEntertainment("강승훈", 87, 54);

        // 지망생
        EntertainerApplicant entertain = new EntertainerApplicant("강승훈", 88, 54);

        jyp.actAudition();
        jyp.singAudition();


    }
}
