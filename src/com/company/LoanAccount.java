package com.company;

import java.io.Serializable;

public class LoanAccount extends Account {

    private double interestRate;

    public LoanAccount(int balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    public void showInfo() {
        System.out.printf("I'm a loan account. I owe %d at a %.2f %% interest rate\n", getBalance(), interestRate);
    }
}
