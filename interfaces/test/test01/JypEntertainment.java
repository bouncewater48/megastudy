package interfaces.test.test01;
// 기획사
public class JypEntertainment {

    private String name;
    private int singPassingScore;
    private int actPassingScore;

    public JypEntertainment(String name, int singPassingScore, int actPassingScore) {
        this.name = name;
        this.singPassingScore = singPassingScore;
        this.actPassingScore = actPassingScore;
    }

    // 연기자 오디션 합격 여부
    public void actAudition() {
        System.out.println(name + "님은 " + singPassingScore + "점으로 오디션에 합격하셨습니다. 축하합니다.");
    }
    
    // 아이돌 오디션 합격 여부
    public void singAudition() {
        System.out.println(name + "님은 " + actPassingScore + "점으로 오디션에 떨어지셨습니다. 죄송합니다.");
    }



}
