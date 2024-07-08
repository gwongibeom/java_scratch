package TodoListWithAccountSystem.Todo;

import TodoListWithAccountSystem.System.ISystem;
import TodoListWithAccountSystem.Utils.InputHandler;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TodoListSystem implements ISystem {
    private ArrayList<Todo> todoList = new ArrayList<>();

    public void addTodo(String title, String accountId) {
        Todo newTodo = new Todo(todoList.size() + 1, title, accountId);
        todoList.add(newTodo);
    }

    public ArrayList<Todo> getTodosByAccount(String accountId) {
        return todoList.stream()
                .filter(todo -> todo.getAccountId().equals(accountId))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void printTodos(String accountId) {
        getTodosByAccount(accountId).forEach(todo -> System.out.println(todo.getId() + " " + todo.getTitle() + " " + todo.getAccountId()));
    }

    public void deleteTodo(int id) {
        if(todoList.removeIf(todo -> todo.getId() == id) == false) System.out.println("해당 투두 없음");
    }


    @Override
    public String printMenuAndGetSelection() {
        InputHandler inputHandler = new InputHandler();
        String selectedMenu = "";
        System.out.print("""
                ==========
                1. 추가
                2. 삭제
                3. 로그아웃
                ==========
                """);
        switch (inputHandler.getIntInput("입력: ")) {
            case 1:
                selectedMenu = "ADD";
                break;
            case 2:
                selectedMenu = "DELETE";
                break;
            case 3:
                selectedMenu = "LOGOUT";
                break;
        }
        return selectedMenu;
    }
}
