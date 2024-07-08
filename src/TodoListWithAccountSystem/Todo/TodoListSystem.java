package TodoListWithAccountSystem.Todo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TodoListSystem {
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
        todoList.removeIf(todo -> todo.getId() == id);
    }


}
