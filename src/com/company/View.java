package com.company;

import java.util.Scanner;

public class View {
    private static View instance = null;
    Scanner scan = new Scanner(System.in);

    private View() {
    }

    public static View getInstance() {
        if (instance == null) {
            instance = new View();
        }
        return instance;
    }

    public MenuItem showMenuAndGetChoice() {
        System.out.println("Welcome to the bank.\nMake a choice.");
        int i = 1;
        for (MenuItem menuItem : MenuItem.values()) {
            System.out.println(i + ". " + menuItem.getPrettyPrint());
            i++;
        }
        int menuChoice = 0;
        do {
            menuChoice = InputSanitizers.convertToInt(scan.nextLine());
            return MenuItem.values()[menuChoice - 1];

        } while (menuChoice != 8);
    }

    public int getBalance(){
        System.out.println("Enter balance:");
        int balance = InputSanitizers.convertToInt(scan.nextLine());
        return balance;
    }

    public double getInterestRate(){
        System.out.println("Enter interest rate");
        double interestRate = InputSanitizers.convertToDouble(scan.nextLine());
        return interestRate;
    }

    public void showErrorMessage(String errormessage) {
        System.out.println("Error: " + errormessage);
    }

    public enum MenuItem {
        ADD_SALARY_ACCOUNT("Add salary account"),
        ADD_SAVINGS_ACCOUNT("Add savings account"),
        ADD_INVESTMENT_ACCOUNT("Add investment account"),
        ADD_LOAN_ACCOUNT("Add loan account"),
        SAVE_ACCOUNTS("Save accounts"),
        LOAD_ACCOUNTS("Load accounts"),
        SHOW_ACCOUNTS("Show accounts"),
        SHOW_CUSTOMER_MENU("Show customer menu"),
        QUIT("Quit");

        private String prettyPrint;

        private MenuItem(String prettyPrint) {
            this.prettyPrint = prettyPrint;
        }

        public String getPrettyPrint() {
            return prettyPrint;
        }
    }
}
