package TodoListWithAccountSystem.Account;

import java.util.ArrayList;

public class AccountSystem {
    public Account userAccount;
    public ArrayList<Account> accountList;

    public void addAccount(String accountId, String accountPassword) {
        Account newAccount = new Account(accountId, accountPassword);
        accountList.add(newAccount);
    }

    public void login(String accountId, String accountPassword) {
        for (Account account : accountList) {
            if(account.login(accountId, accountPassword)) userAccount = account;
        }

        if(userAccount == null) System.out.println("Account not found");
    }

    public void logout() {
        userAccount = null;
    }
}
