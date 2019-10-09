package com.company;

import java.io.Serializable;

public class SalaryAccount extends Account {

    public SalaryAccount(int balance){
        super(balance);
    }

    @Override
    public void showInfo() {
        System.out.printf("I'm a salary account and %d is my balance\n", getBalance());
    }
}
