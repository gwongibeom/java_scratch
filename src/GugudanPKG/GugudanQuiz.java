package GugudanPKG;
import java.util.Random;


public class GugudanQuiz {
    private final int numberOne;
    private final int numberTwo;
    private final int answer;

    public GugudanQuiz() {
        numberOne = new Random().nextInt(8) + 2;
        numberTwo = new Random().nextInt(8) + 2;
        answer = numberOne * numberTwo;

        System.out.println(numberOne + " * " + numberTwo);
    }

    public boolean checkAnswer(int userInput) {
        return answer == userInput ;
    }

}
