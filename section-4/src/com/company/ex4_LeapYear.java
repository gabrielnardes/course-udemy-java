package com.company;

public class ex4_LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        boolean step1 = year % 4 == 0;
        boolean step2 = year % 100 == 0;
        boolean step3 = year % 400 == 0;
        boolean step4 = true;
        boolean step5 = false;

        if (step1) {
            if (step2) {
                if (step3) {
                    return step4;
                }
            } else {
                return step4;
            }
        }
        return step5;
    }
}
