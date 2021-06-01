package section5;

import static section5.ex16_FirstAndLastDigitSum.sumFirstAndLastDigit;

public class Section5 {
    public static void main(String[] args) {
        // Exercise 12 - Number In Word
/*
        printNumberInWord(1);
        printNumberInWord(5);
        printNumberInWord(1123);
        printNumberInWord(-1);
*/
        // Exercise 13 - Exercise 13: Number Of Days In Month
/*
        System.out.println(getDaysInMonth(1, 2020)); // should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); // should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018)); // should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020)); // should return -1 since the parameter year is outside the range of 1 to 9999.
*/
        // Exercise 14 - Sum Odd
 /*
        System.out.println(sumOdd(1, 100)); // should return 2500
        System.out.println(sumOdd(-1, 100)); // should return -1
        System.out.println(sumOdd(100, 100)); // should return 0
        System.out.println(sumOdd(13, 13)); // should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100)); // should return -1
        System.out.println(sumOdd(100, 1000)); // should return 247500
 */
        // 15 - Number Palindrome
/*
        System.out.println(isPalindrome(-1221)); // should return true
        System.out.println(isPalindrome(707)); // should return true
        System.out.println(isPalindrome(11212)); // should return false because reverse is 21211 and that is not equal to 11212.
*/

        // Exercise 16 - First And Last Digit Sum
        System.out.println(sumFirstAndLastDigit(252)); // should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(sumFirstAndLastDigit(257)); // should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(sumFirstAndLastDigit(0)); // should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(sumFirstAndLastDigit(5)); // should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(sumFirstAndLastDigit(-10)); // should return -1, since the parameter is negative and needs to be positive.
    }
}
