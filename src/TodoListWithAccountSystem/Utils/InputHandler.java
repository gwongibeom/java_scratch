package TodoListWithAccountSystem.Utils;

import java.util.Scanner;

public class InputHandler {
    public String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String input = scanner.nextLine();

        return input.trim();
    }

    public int getIntInput(String prompt) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(prompt);
            String input = scanner.nextLine();
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("정수를 입력 해주세요.");
            return 9999;
        }
    }
}
