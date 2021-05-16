package com.company;

public class ex13_NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        int days;
        switch (month) {
            case 2:
                days = isLeapYear(year) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        return days;
    }
}
