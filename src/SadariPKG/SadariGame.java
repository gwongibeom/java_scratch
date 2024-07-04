package SadariPKG;

public class SadariGame {
    public void start() throws Exception {
        InputHandler inputHandler = new InputHandler();
        final int NUMBER_OF_PLAYERS = inputHandler.getUserInput("참여인원을 입력해주세요. : ", 2);
        final int START = 0, LAST = NUMBER_OF_PLAYERS - 1;

        Sadari[] sadariList = new Sadari[NUMBER_OF_PLAYERS];

        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            if (i == START) {
                sadariList[i] = new Sadari("FIRST");
                System.out.println("FIRST");
            } else if (i == LAST) {
                sadariList[i] = new Sadari("LAST");
                System.out.println("LAST");
            } else {
                sadariList[i] = new Sadari();
                System.out.println("DEFAULT");
            }

            sadariList[i].getter();
        }
    }
}
