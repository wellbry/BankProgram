package com.company;

public class InputSanitizers {
    public static int convertToInt(String str) {
        try {
            int number = Integer.parseInt(str);
            return number;
        } catch (Exception e) {
            return 0;
        }
    }

    public static double convertToDouble(String str) {
        try {
            double number = Double.parseDouble(str);
            return number;
        } catch (Exception e) {
            return 0;
        }
    }
}
