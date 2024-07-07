package TodoListWithAccountSystem.Utils;

import java.util.Scanner;

public class InputHandler {
    public String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String input = scanner.nextLine();

        return input.trim();
    }
}
