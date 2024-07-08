package TodoListWithAccountSystem.Account;

import java.util.ArrayList;

public class AccountSystem {
    public Account userAccount;
    public ArrayList<Account> accountList = new ArrayList<>();

    public void addAccount(String accountId, String accountPassword) {
        Account newAccount = new Account(accountId, accountPassword);
        accountList.add(newAccount);
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public void login(String accountId, String accountPassword) {
        for (Account account : accountList) {
            if(account.login(accountId, accountPassword)){
                userAccount = account;
                System.out.println(userAccount.getAccountId() + " 로그인 됨");
            }
        }

        if(userAccount == null) System.out.println("계정을 찾을 수 없어요");
    }

    public void logout() {
        userAccount = null;
    }
}
