package com.company;

import java.io.Serializable;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double interestRate){
        super(0);
        this.interestRate = interestRate;
    }

    @Override
    public void showInfo() {
        System.out.printf("This is a savings account with a balance of %d and a %.2f %% interest rate\n", getBalance(), interestRate);
    }
}
