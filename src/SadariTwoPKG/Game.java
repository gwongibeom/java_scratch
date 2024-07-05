package SadariTwoPKG;

public class Game {
    public void start() throws Exception {
        InputHandler inputHandler = new InputHandler();
        final int PLAYERS_COUNT = inputHandler.getUserIntegerInput("참여인원을 입력해주세요. : ",2);
        printLineNumber(PLAYERS_COUNT);

        Sadari sadari = new Sadari(PLAYERS_COUNT);
        final int PLAYER_SELECT_COL = inputHandler.getUserIntegerInput("뽑고 싶은 라인을 선택해주세요.(0번부터 "+PLAYERS_COUNT+"번 까지) : ");
        sadari.sadariMoveToDown(PLAYER_SELECT_COL);
    }

    private void printLineNumber(int PLAYERS_COUNT) {
        for (int i = 0; i < PLAYERS_COUNT + (PLAYERS_COUNT - 1); i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        for (int i = 0; i < PLAYERS_COUNT + (PLAYERS_COUNT - 1); i++) {
            System.out.print("--");
        }
        System.out.println();
    }
}
