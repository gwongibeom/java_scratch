package SadariTwoPKG;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    public int getUserIntegerInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();

        return userInput;
    }

    public int getUserIntegerInput(String CONTEXT) {
        Scanner sc = new Scanner(System.in);
        System.out.print(CONTEXT);
        int userInput = sc.nextInt();

        return userInput;
    }

    public int getUserIntegerInput(String CONTEXT, int minNumber) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print(CONTEXT);
        int userInput = sc.nextInt();
        if (userInput < minNumber) {
            throw new InputMismatchException("최소 입력 숫자는 " + minNumber + "입니다.");
        }

        return userInput;
    }
}
