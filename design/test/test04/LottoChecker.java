package design.test.test04;

import java.util.Random;

// 로또 당첨 확인
public class LottoChecker {

    // 당첨번호
    private int[] winningNumbers = new int[6];

    // 랜덤 당첨번호 뽑기
    public void drawLots() {
        Random random = new Random();
        int randomNumber = 0;
        for (int i = 0; i < winningNumbers.length; i++) {
            // 0 ~ 44
//        random.nextInt(45);
            // 1 ~ 45
            randomNumber = random.nextInt(45) + 1;
            winningNumbers[i] = randomNumber;

            for(int j = 0; j < i; j++) {
                // 이미 뽑은 수 중 새롭게 얻은 임의의 수가 있는지 확인
                if(winningNumbers[j] == randomNumber) {
                    // 중복
                    i--;
                    break;
                }
            }

        }

    }

//    public void setWinningNumber(int number1, int number2, int number3, int number4, int number5, int number6) {
//        winningNumbers[0] = number1;
//        winningNumbers[1] = number2;
//        winningNumbers[2] = number3;
//        winningNumbers[3] = number4;
//        winningNumbers[4] = number5;
//        winningNumbers[5] = number6;
//    }

    // 일치 개수 확인 기능
    public int checkCount(Lotto lotto) {

//        int[] numbers = lotto.getNumbers();
        int[] numbers = lotto.getNumbers();

        int count = 0;
        for (int i = 0; i < winningNumbers.length; i++) {
            // i 값에 대한 모든 것을 확인
            for (int j = 0; j < numbers.length; j++) {
                if (winningNumbers[i] == numbers[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;

    }

    // 당첨 정보 출력 기능
    public void printResult(Lotto lotto) {
        int count = checkCount(lotto);

        switch (count) {
            case 6:
                System.out.println("1등!!");
                break;
            case 5:
                System.out.println("2등!");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 3:
                System.out.println("4등");
                break;
            case 2:
                System.out.println("5등");
                break;
            case 1:
                System.out.println("6등");
                break;
            default:
                System.out.println("꽝!");
        }

    }


    public void printInfo() {
        System.out.print("당첨번호 : ");
        for (int i = 0; i < winningNumbers.length; i++) {
            System.out.print(winningNumbers[i] + " ");
        }
        System.out.println();
    }

}
