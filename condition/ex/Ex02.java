package condition.ex;

public class Ex02 {
    public static void main(String[] args) {
        int walking = 10100;
        int weight = 68;
        // 만보를 걷고 몸무게가 70kg 안되면 치킨 먹자
        // 만약 만보 이상을 걷는다    몸무게가 70 이하다 그러면 치킨을 먹자

        if(walking >= 10000 && weight <= 70){
            System.out.println("치킨 먹자!!");
        }

        // 만보를 걷거나 몸무게가 70kg 안되면 치킨 먹자
        // 만약 만보 이상을 걷는다 또는 몸무게가 70kg 이하다 그러면 치킨 먹자
        if(walking >= 10000 || weight <= 70){
            System.out.println("치킨을 먹자");
        }

        int number = 20;
        // 10 < number < 40
        // 10보다 크고 40보다 작다
        if(10 < number && number < 40) {
            
        }
    }
}
