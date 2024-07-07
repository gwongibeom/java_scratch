package TodoListWithAccountSystem.Todo;

import java.util.ArrayList;

public class TodoListSystem {
    ArrayList<Todo> todoList;

    public void addTodo(String title, String accountId) {
        Todo newTodo = new Todo(todoList.size() + 1, title, accountId);
        todoList.add(newTodo);
    }

    public ArrayList<Todo> loadTodosByAccount(String accountId) {
        ArrayList<Todo> filteredTodolist = (ArrayList<Todo>) todoList.stream().filter(todo -> todo.getAccountId() == accountId);
        return filteredTodolist;
    };

    public void deleteTodo(int id) {
        todoList.remove(id);
    }


}
