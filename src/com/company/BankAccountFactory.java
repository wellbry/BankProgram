package com.company;


public class BankAccountFactory {


    public static Account createAccount(AccountType accountType){
        switch (accountType){
            case SALARY:
                int balance = View.getInstance().getBalance();
                return new SalaryAccount(balance);
            case SAVINGS:
                double interestRate = View.getInstance().getInterestRate();
                return new SavingsAccount(interestRate);
            case INVESTMENT:
                return new InvestmentAccount();
            case LOAN:
               int balance2 = View.getInstance().getBalance();
               double interestRate2 = View.getInstance().getInterestRate();
               return new LoanAccount(balance2, interestRate2);
            default:
                View.getInstance().showErrorMessage("Couldn't create account of type " + accountType);
                return null;
        }
    }

    public enum AccountType {
        SALARY,
        INVESTMENT,
        SAVINGS,
        LOAN
    }
}

