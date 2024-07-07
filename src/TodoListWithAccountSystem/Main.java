package TodoListWithAccountSystem;

import TodoListWithAccountSystem.Account.AccountSystem;
import TodoListWithAccountSystem.Todo.Todo;
import TodoListWithAccountSystem.Todo.TodoListSystem;
import TodoListWithAccountSystem.Utils.ConsoleTool;
import TodoListWithAccountSystem.Utils.InputHandler;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        AccountSystem accountSystem = new AccountSystem();
        InputHandler inputHandler = new InputHandler();
        TodoListSystem todoListSystem = new TodoListSystem();

        String id = inputHandler.getStringInput("id: ");
        String password = inputHandler.getStringInput("password: ");

        accountSystem.addAccount(id, password);
        accountSystem.login(id,password);

        todoListSystem.addTodo("김치 썰기", accountSystem.getUserAccount().getAccountId());
        ArrayList<Todo> test = todoListSystem.loadTodosByAccount(accountSystem.getUserAccount().getAccountId());

        for (Todo todo : test) {
            System.out.println(todo.getTitle());
        }



    }
}
