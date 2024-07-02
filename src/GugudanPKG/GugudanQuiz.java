package GugudanPKG;
import java.util.Random;


public class GugudanQuiz {
    private final int ANSWER;

    public GugudanQuiz() {
        int NUMBERONE = new Random().nextInt(8) + 2;
        int NUMBERTWO = new Random().nextInt(8) + 2;
        ANSWER = NUMBERONE * NUMBERTWO;

        System.out.println(NUMBERONE + " * " + NUMBERTWO);
    }

    public boolean checkAnswer(int userInput) {
        return ANSWER == userInput ;
    }

}
