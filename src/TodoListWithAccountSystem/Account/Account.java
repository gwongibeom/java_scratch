package TodoListWithAccountSystem.Account;

public class Account {
    private String accountId;
    private String accountPassword;

    Account(String accountId, String accountPassword) {
        this.accountId = accountId;
        this.accountPassword = accountPassword;
    }

    public boolean login(String accountId, String accountPassword) {
        if(this.accountId.equals(accountId) && this.accountPassword.equals(accountPassword)) return true;
        return false;
    }


}
