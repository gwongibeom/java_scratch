package SadariPKG;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {
    public int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();

        return userInput;
    }

    public int getUserInput(String CONTEXT) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        return userInput;
    }

    public int getUserInput(String CONTEXT, int minNumber) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print(CONTEXT);
        int userInput = sc.nextInt();
        if (userInput < minNumber) {
            throw new Exception("최소 입력 숫자는 "+minNumber+"입니다.");
        }

        return userInput;
    }
}
