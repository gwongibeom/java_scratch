package TodoListWithAccountSystem.Todo;

public class Todo {
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAccountId() {
        return accountId;
    }

    private int id;
    private String title;
    private String accountId;

    Todo(int id, String title, String accountId) {
        this.id = id;
        this.title = title;
        this.accountId = accountId;
    }


}