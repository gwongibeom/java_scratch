package SadariTwoPKG;

import java.util.Arrays;
import java.util.Random;

public class Sadari {
    int[][] sadariArray;
    int totalColsCount;
    int totalRowsCount;

    Sadari(int PLAYERS_COUNT) {
        totalColsCount = PLAYERS_COUNT + (PLAYERS_COUNT - 1);
        totalRowsCount = 7;

        sadariArray = new int[totalRowsCount][totalColsCount];

        for (int i = 0; i < totalColsCount; i++) {
            for (int j = 0; j < totalRowsCount; j++) {
                // 첫번째 줄이 아닐시 40프로 확률로 생성
                if (j != 0 && j != 6 && getRandomNumber(1, 10) <= 4) sadariArray[j][i] = 1;

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

    public void sadariMoveToDown(int PLAYER_SELECT_COL) throws Exception {
        int playerSelectCol = PLAYER_SELECT_COL;
        int col = playerSelectCol;
        int row = 0;

        System.out.println("시작 위치: row:" + row + " col:" + col);
        if(sadariArray[row][col] != 1) {
            throw new Exception("선이 있는 줄이 아니에요.");
        }

        while (row < totalRowsCount) {
            System.out.println("현재 위치: (" + row + ", " + col + ")");

            if (col < totalColsCount - 1 && sadariArray[row][col + 1] == 1) {
                System.out.println("오른쪽으로 이동");
                col += 2;
            } else if (col > 0 && sadariArray[row][col - 1] == 1) {
                System.out.println("왼쪽으로 이동");
                col -= 2;
            } else {
                System.out.println("아래쪽으로 이동");
            }

            row++;
        }
        System.out.println("시작한 줄: " + PLAYER_SELECT_COL + " 도착한 줄: "+ col);


    }


    private int getRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
