package com.company;

import java.util.ArrayList;

public class BankProgram {
    private ArrayList<Account> accounts = new ArrayList<>();

    public void run() {

        /*
        for (BankAccountFactory.AccountType accountType : BankAccountFactory.AccountType.values()){
            Account tempAccount = BankAccountFactory.createAccount(accountType);
            if (tempAccount != null){
                accounts.add(tempAccount);
            }
        }
        for (Account account: accounts) {
            account.showInfo();
        }
*/

        View view = View.getInstance();

        View.MenuItem menuChoice = null;
        Account tempAccount = null;
        do {
        menuChoice = view.showMenuAndGetChoice();
            switch (menuChoice) {
                case ADD_SALARY_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.SALARY);
                    break;
                case ADD_SAVINGS_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.SAVINGS);
                    break;
                case ADD_INVESTMENT_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.INVESTMENT);
                    break;
                case ADD_LOAN_ACCOUNT:
                    addAccount(BankAccountFactory.AccountType.LOAN);
                    break;
                case SAVE_ACCOUNTS:
                    FileUtils.saveObject(accounts, "Accounts.ser");
                    break;
                case LOAD_ACCOUNTS:
                    accounts = (ArrayList<Account>) FileUtils.loadObject("Accounts.ser");
                    break;
                case SHOW_ACCOUNTS:
                    System.out.println("\nAccounts:");
                    for (Account account : accounts) {
                        account.showInfo();
                    }
                    System.out.println("----\n");
                    break;
                case QUIT:
                    System.exit(0);
                    break;
                default:
                    view.showErrorMessage("No such alternative");
            }
        } while (menuChoice != View.MenuItem.QUIT);
    }

    private void addAccount(BankAccountFactory.AccountType accountType){
        Account tempAccount = BankAccountFactory.createAccount(accountType);
        if (tempAccount != null) {
            accounts.add(tempAccount);
        }
    }

}
