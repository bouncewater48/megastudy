package design.test.test04;

import java.util.Random;

public class Lotto {

    private int[] lottoNum = new int[6];
    
    // 로또 번호 수동으로 받아서 저장
    public Lotto(int[] number) {
        for (int i = 0; i < 6; i++) {
            lottoNum[i] = number[i];
        }
    }
    
    // 로또 번호 자동으로 생성해서 저장
    public void setRandom() {
            Random random = new Random();
        int Lotto = random.nextInt(44) + 1;
        for(int i = 0; i < lottoNum.length; i++) {
            boodlean duplication = false; // 중복확인
                for(int j = 0; j < i; j++) {
                    if(lottoNum[i] == Lotto){
                        duplication = true;
                        break;
                    }
                }
                if(duplication) {
                    i--; //중복일시 다시 뽑는 기능
                } else {
                    numbers[i]
                }

            }

    }
}
