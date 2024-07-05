package SadariTwoPKG;

import java.util.Random;

public class Sadari {

    private int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    Sadari(int PLAYERS_COUNT) {
        int totalRowsCount = PLAYERS_COUNT + (PLAYERS_COUNT - 1);

        int[][] sadariArray = new int[7][totalRowsCount];

        for (int i = 0; i < totalRowsCount; i++) {
            for (int j = 0; j < 7; j++) {
                // 첫번째 줄이 아닐시 40프로 확률로 생성
                if (j != 0 && getRandomNumber(1, 10) <= 4) sadariArray[j][i] = 1;

                // 왼쪽에 이미 길이 있을 시 생성 무효화
                if (i >= 3 && sadariArray[j][i - 2] == 1) sadariArray[j][i] = 0;

                // 세로줄 강제 생성
                if (i % 2 == 0) sadariArray[j][i] = 1;
            }
        }

        for (int[] row : sadariArray) { // 디버깅
            for (int col : row) System.out.print(col + " ");
            System.out.println();
        }
    }
}
