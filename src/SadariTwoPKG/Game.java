package SadariTwoPKG;

public class Game {
    public void start() {
        InputHandler inputHandler = new InputHandler();
        final int PLAYERS_COUNT = inputHandler.getUserIntegerInput("참여인원을 입력해주세요. : ");

        Sadari sadari = new Sadari(PLAYERS_COUNT);
    }
}
