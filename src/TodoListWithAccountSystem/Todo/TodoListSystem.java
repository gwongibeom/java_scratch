package TodoListWithAccountSystem.Todo;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TodoListSystem {
    ArrayList<Todo> todoList;

    public void addTodo(String title, String accountId) {
        Todo newTodo = new Todo(todoList.size() + 1, title, accountId);
        todoList.add(newTodo);
    }

    public ArrayList<Todo> loadTodosByAccount(String accountId) {
        return todoList.stream()
                .filter(todo -> todo.getAccountId().equals(accountId))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public void deleteTodo(int id) {
        todoList.remove(id);
    }


}
