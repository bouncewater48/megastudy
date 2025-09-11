package interfaces.test.test01;

// 지망생
public class EntertainerApplicant implements Act, Sing {

    private String name;
    private int actScore;
    private int singScore;

    public EntertainerApplicant(String name, int actScore, int singScore) {
        this.name = name;
        this.actScore = actScore;
        this.singScore = singScore;
    }

    @Override
    public void act() {
        System.out.println("연기 점수 :" +actScore);
    }

    @Override
    public void sing() {
        System.out.println("노래 점수 : " + singScore);
    }

    public String getName() {
        return name;
    }
}
