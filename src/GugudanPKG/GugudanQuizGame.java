package GugudanPKG;

public class GugudanQuizGame {
    public static void start() {
        boolean isGameRunning = true;
        int userScore = 0;

        System.out.println("Welcome to the Gugudan Quiz!");
        while (isGameRunning) {
            GugudanQuiz gugudanQuiz = new GugudanQuiz();
            InputHandler inputHandler = new InputHandler();

            int userInput = inputHandler.getUserInput();
            isGameRunning = gugudanQuiz.checkAnswer(userInput);

            if (isGameRunning) {
                userScore++;
            }
        }
        System.out.println("Your Score is "+ userScore);
    }
}
