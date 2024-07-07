package TodoListWithAccountSystem.Account;

public class Account {
    private final String accountId;
    private final String accountPassword;

    Account(String accountId, String accountPassword) {
        this.accountId = accountId;
        this.accountPassword = accountPassword;
    }

    public boolean login(String accountId, String accountPassword) {
        return this.accountId.equals(accountId) && this.accountPassword.equals(accountPassword);
    }


}
