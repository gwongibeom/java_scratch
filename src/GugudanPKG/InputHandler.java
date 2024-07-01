package GugudanPKG;
import java.util.Scanner;

public class InputHandler {
    public int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();

        return userInput;
    }
}
