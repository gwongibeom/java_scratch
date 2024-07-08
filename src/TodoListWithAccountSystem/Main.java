package TodoListWithAccountSystem;

import TodoListWithAccountSystem.Account.AccountSystem;
import TodoListWithAccountSystem.Todo.TodoListSystem;
import TodoListWithAccountSystem.Utils.ConsoleTool;
import TodoListWithAccountSystem.Utils.InputHandler;

public class Main {
    private static final AccountSystem accountSystem = new AccountSystem();
    private static final InputHandler inputHandler = new InputHandler();
    private static final TodoListSystem todoListSystem = new TodoListSystem();
    private static final ConsoleTool consoleTool = new ConsoleTool();

    public static void main(String[] args) throws Exception {
        while (true) {
            if (accountSystem.getUserAccount() == null) {
                handleAccountMenu();
            } else {
                handleTodoMenu();
            }
        }
    }

    private static void handleAccountMenu() throws Exception {
        consoleTool.clear();
        String accountSelectedMenu = accountSystem.printMenuAndGetSelection();
        String id = inputHandler.getStringInput("id: ");
        String password = inputHandler.getStringInput("password: ");

        switch (accountSelectedMenu) {
            case "LOGIN":
                accountSystem.login(id, password);
                break;
            case "JOIN":
                accountSystem.addAccount(id, password);
                break;
        }
    }

    private static void handleTodoMenu() throws InterruptedException {
        consoleTool.clear();
        todoListSystem.printTodos(accountSystem.getUserAccount().getAccountId());
        String todoSelectedMenu = todoListSystem.printMenuAndGetSelection();

        switch (todoSelectedMenu) {
            case "ADD":
                String title = inputHandler.getStringInput("제목: ");
                todoListSystem.addTodo(title, accountSystem.getUserAccount().getAccountId());
                break;
            case "DELETE":
                int todoNumber = inputHandler.getIntInput("번호: ");
                todoListSystem.deleteTodo(todoNumber);
                break;
            case "LOGOUT":
                accountSystem.logout();
                break;
        }
    }
}