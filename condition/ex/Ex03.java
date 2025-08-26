package condition.ex;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int weight = 74;
        // 몸무게가 70이하면 치킨먹자 그렇지 않으면 샐러드 먹자
        if(weight <= 70) {
            System.out.println("치킨 먹자");
        } else {
            System.out.println("샐러드 먹자");
        }
        
        // 몸무게가 70 이하면 치킨
        // 그렇지 않고 만약에 75 이하라면 닭가슴살
        // 그렇지 않고 만약에 80 이하라면 샐러드
        // 그렇지 않으면 굼어!!!

        if(weight <= 70) {
            System.out.println("치킨 먹자!");
//        } else if(weight > 70 && weight <= 75) {
          } else if(weight <= 75) {
            System.out.println("닭가슴살 먹자!");
        } else if (weight <= 80) {
            System.out.println("샐러드 먹자!");
        } else {
            System.out.println("굶어!");
        }

    }
}
