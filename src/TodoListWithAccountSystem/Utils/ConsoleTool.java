package TodoListWithAccountSystem.Utils;

public class ConsoleTool {
    public void clear() throws InterruptedException {
        Thread.sleep(600);
        for (int i = 0; i <= 100; i++) {
            System.out.println();
        }
    }
}
