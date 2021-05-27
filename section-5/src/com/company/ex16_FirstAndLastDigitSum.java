package com.company;

public class ex16_FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
            
        int lastDigit = number % 10;
        
        return firstDigit + lastDigit;
    }
}
