package com.company;

import java.io.Serializable;

public class InvestmentAccount extends Account {

    public InvestmentAccount(){
        super(0);
    }

    @Override
    public void showInfo() {
        System.out.printf("I'm an investment account with a balance of %d\n", getBalance());
    }
}
