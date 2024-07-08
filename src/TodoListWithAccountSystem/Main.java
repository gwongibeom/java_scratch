package TodoListWithAccountSystem;

import TodoListWithAccountSystem.Account.AccountSystem;
import TodoListWithAccountSystem.Todo.TodoListSystem;
import TodoListWithAccountSystem.Utils.ConsoleTool;
import TodoListWithAccountSystem.Utils.InputHandler;


public class Main {
    public static void main(String[] args) throws Exception {
        AccountSystem AC = new AccountSystem();
        InputHandler IH = new InputHandler();
        TodoListSystem TLS = new TodoListSystem();
        ConsoleTool CT = new ConsoleTool();

        while (true) {
            if (AC.getUserAccount() == null) {
                CT.clear();
                String accountSelectedMenu = AC.printMenuAndGetSelection();
                String id = IH.getStringInput("id: ");
                String password = IH.getStringInput("password: ");

                if (accountSelectedMenu.equals("LOGIN")) AC.login(id, password);
                if (accountSelectedMenu.equals("JOIN")) AC.addAccount(id, password);
                continue;
            }

            CT.clear();
            TLS.printTodos(AC.getUserAccount().getAccountId());
            String todoSelectedMenu = TLS.printMenuAndGetSelection();
            if (todoSelectedMenu.equals("ADD"))
                TLS.addTodo(IH.getStringInput("제목: "), AC.getUserAccount().getAccountId());
            if (todoSelectedMenu.equals("DELETE")) TLS.deleteTodo(IH.getIntInput("번호: "));
            if (todoSelectedMenu.equals("LOGOUT")) AC.logout();

        }
    }
}
