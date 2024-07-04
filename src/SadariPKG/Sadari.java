package SadariPKG;

import java.util.Random;

public class Sadari {
    private int[][] SaDariBigLine = {
            {0, 1, 0}, //1
            {0, 1, 0}, //2
            {0, 1, 0}, //3
            {0, 1, 0}, //4
            {0, 1, 0}, //5
            {0, 1, 0}, //6
            {0, 1, 0}, //7
            {0, 1, 0}, //8
            {0, 1, 0}, //9
            {0, 1, 0}, //10
    };

    Sadari() { //init
        System.out.println("DEFAULT");
        Random random = new Random();
        for (int i = 0; i < SaDariBigLine.length; i++) {
            for (int j = 0; j < SaDariBigLine[i].length; j++) {
                int randomNumber = random.nextInt(10) + 1;

                if (SaDariBigLine[i][j] == 0 && randomNumber < 3) {
                    SaDariBigLine[i][j] = 1;
                }
            }
        }
    }

    Sadari(String CONTEXT) {
        if (CONTEXT.isEmpty()) {
            throw new IllegalArgumentException("CONTEXT cannot be empty");
        }
        Random random = new Random();
        if (CONTEXT.equals("FIRST")) {
            System.out.println("CONTEXT: FIRST");
            for (int i = 0; i < SaDariBigLine.length; i++) {
                for (int j = 1; j < SaDariBigLine[i].length; j++) { // 시작 인덱스를 1로 변경
                    int randomNumber = random.nextInt(10) + 1;

                    if (SaDariBigLine[i][j] == 0 && randomNumber < 3) {
                        SaDariBigLine[i][j] = 1;
                    }
                }
            }
        }

        if (CONTEXT.equals("LAST")) {
            System.out.println("CONTEXT: LAST");
            for (int i = 0; i < SaDariBigLine.length; i++) {
                for (int j = 0; j < SaDariBigLine[i].length - 1; j++) { // 마지막 인덱스를 2로 변경
                    int randomNumber = random.nextInt(10) + 1;

                    if (SaDariBigLine[i][j] == 0 && randomNumber < 3) {
                        SaDariBigLine[i][j] = 1;
                    }
                }
            }
        }
    }

    public void getter() {
        for (int[] col : SaDariBigLine) {
            for (int item : col) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

}
