package design.test.test04;

import java.util.Random;

public class Lotto {

    // 선택된 6개의 숫자
    private int[] numbers = new int[6];

    // 로또 번호 수동으로 선택해서 저장
    public void manual(int number1, int number2, int number3, int number4, int number5, int number6) {

        numbers[0] = number1;
        numbers[1] = number2;
        numbers[2] = number3;
        numbers[3] = number4;
        numbers[4] = number5;
        numbers[5] = number6;

    }

    // 자동 뽑기
    public void auto() {
        Random random = new Random();
        int randomNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            // 0 ~ 44
//        random.nextInt(45);
            // 1 ~ 45
            randomNumber = random.nextInt(45) + 1;
            numbers[i] = randomNumber;

            for (int j = 0; j < i; j++) {
                // 이미 뽑은 수 중 새롭게 얻은 임의의 수가 있는지 확인
                if (numbers[j] == randomNumber) {
                    // 중복
                    i--;
                    break;
                }
            }
        }
    }

    public int[] getNumbers() {
        return numbers;
    }

        // 로또 번호 확인
        public void printInfo () {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }



}
