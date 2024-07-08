package TodoListWithAccountSystem.Account;

import TodoListWithAccountSystem.System.ISystem;
import TodoListWithAccountSystem.Utils.InputHandler;

import java.util.ArrayList;

public class AccountSystem implements ISystem {
    private Account userAccount;
    private ArrayList<Account> accountList = new ArrayList<>();

    public void addAccount(String accountId, String accountPassword) {
        Account newAccount = new Account(accountId, accountPassword);
        accountList.add(newAccount);
        System.out.println(newAccount.getAccountId()+" 회원가입 됨");
    }

    public Account getUserAccount() {
        return userAccount;
    }

    public void login(String accountId, String accountPassword) {
        for (Account account : accountList) {
            if (account.login(accountId, accountPassword)) {
                userAccount = account;
                System.out.println(userAccount.getAccountId() + " 로그인 됨");
            }
        }

        if (userAccount == null) System.out.println("계정을 찾을 수 없어요");
    }

    public void logout() {
        userAccount = null;
    }

    @Override
    public String printMenuAndGetSelection() throws Exception {
        InputHandler inputHandler = new InputHandler();
        String selectedMenu = "";
        System.out.print("""
                ==========
                1. 로그인
                2. 회원가입
                ==========
                """);
        switch (inputHandler.getIntInput("입력: ")) {
            case 1:
                System.out.println("로그인을 시작합니다.");
                selectedMenu = "LOGIN";
                break;
            case 2:
                System.out.println("회원가입을 시작합니다.");
                selectedMenu = "JOIN";
                break;
            default:
                selectedMenu = "WRONG";
                break;
        }
        if (selectedMenu.equals("WRONG")) {
            throw new Exception("잘못 된 값");
        }
        return selectedMenu;
    }
}
