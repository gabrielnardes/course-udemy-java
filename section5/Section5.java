package section5;

import static section5.ex12_NumberInWord.printNumberInWord;
import static section5.ex13_NumberOfDaysInMonth.getDaysInMonth;
import static section5.ex14_SumOddRange.sumOdd;
import static section5.ex15_NumberPalindrome.isPalindrome;
import static section5.ex16_FirstAndLastDigitSum.sumFirstAndLastDigit;
import static section5.ex17_EvenDigitSum.getEvenDigitSum;
import static section5.ex18_SharedDigit.hasSharedDigit;
import static section5.ex19_LastDigitChecker.hasSameLastDigit;
import static section5.ex20_GreatestCommonDivisor.getGreatestCommonDivisor;
import static section5.ex21_FactorPrinter.printFactors;
import static section5.ex22_PerfectNumber.isPerfectNumber;
import static section5.ex23_NumberToWords.*;
import static section5.ex24_FlourPacker.canPack;
import static section5.ex25_LargestPrime.getLargestPrime;

public class Section5 {
    public static void main(String[] args) {
//        ex12();
//        ex13();
//        ex14();
//        ex15();
//        ex16();
//        ex17();
//        ex18();
//        ex19();
//        ex20();
//        ex21();
//        ex22();
//        ex23();
//        ex24();
//        ex25();
    }

    private static void ex12() {
        System.out.println("\nExercise 12 - Number In Word - Section 5");
        printNumberInWord(1); // should print ONE
        printNumberInWord(5); // should print FIVE
        printNumberInWord(1123); // should print OTHER
        printNumberInWord(-1); // should print OTHER
    }

    private static void ex13() {
        System.out.println("\nExercise 13 - Number Of Days In Month - Section 5");
        System.out.println(getDaysInMonth(1, 2020)); // should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); // should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018)); // should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); // should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020)); // should return -1 since the parameter year is outside the range of 1 to 9999.
    }

    private static void ex14() {
        System.out.println("\nExercise 14 - Sum Odd - Section 5");
        System.out.println(sumOdd(1, 100)); // should return 2500
        System.out.println(sumOdd(-1, 100)); // should return -1
        System.out.println(sumOdd(100, 100)); // should return 0
        System.out.println(sumOdd(13, 13)); // should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100)); // should return -1
        System.out.println(sumOdd(100, 1000)); // should return 247500
    }

    private static void ex15() {
        System.out.println("\nExercise 15 - Number Palindrome - Section 5");
        System.out.println(isPalindrome(-1221)); // should return true
        System.out.println(isPalindrome(707)); // should return true
        System.out.println(isPalindrome(11212)); // should return false because reverse is 21211 and that is not equal to 11212.
    }

    private static void ex16() {
        System.out.println("\nExercise 16 - First And Last Digit Sum - Section 5");
        System.out.println(sumFirstAndLastDigit(252)); // should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(sumFirstAndLastDigit(257)); // should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(sumFirstAndLastDigit(0)); // should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(sumFirstAndLastDigit(5)); // should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(sumFirstAndLastDigit(-10)); // should return -1, since the parameter is negative and needs to be positive.
    }

    private static void ex17() {
        System.out.println("\nExercise 17 - Even Digit Sum - Section 5");
        System.out.println(getEvenDigitSum(123456789)); // should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); // should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); // should return -1 since the number is negative
    }

    private static void ex18() {
        System.out.println("\nExercise 18 - Shared Digit - Section 5");
        System.out.println(hasSharedDigit(12, 23)); // should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); // should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); // should return true since the digit 5 appears in both numbers
    }

    private static void ex19() {
        System.out.println("\nExercise 19 - Last Digit Checker - Section 5");
        System.out.println(hasSameLastDigit(41, 22, 71)); // should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42)); // should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999)); // should return false since 9 is not within the range of 10-1000
    }

    private static void ex20() {
        System.out.println("\nExercise 20 - Greatest Common Divisor - Section 5");
        System.out.println(getGreatestCommonDivisor(25, 15)); // should return 5 since both can be divided by 5 without a remainder
        System.out.println(getGreatestCommonDivisor(12, 30)); // should return 6 since both can be divided by 6 without a remainder
        System.out.println(getGreatestCommonDivisor(9, 18)); // should return -1 since the first parameter is < 10
        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9 since both can be divided by 9 without a remainder
    }

    private static void ex21() {
        System.out.println("\nExercise 21 - All Factors - Section 5");
        printFactors(6); // should print 1 2 3 6
        printFactors(32); // should print 1 2 4 8 16 32
        printFactors(10); // should print 1 2 5 10
        printFactors(-1); // should print "Invalid Value" since number is < 1
    }

    private static void ex22() {
        System.out.println("\nExercise 22 - Perfect Number - Section 5");
        System.out.println(isPerfectNumber(6)); // should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(isPerfectNumber(28)); // should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(isPerfectNumber(5)); // should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(isPerfectNumber(-1)); // should return false since the number is < 1
    }

    private static void ex23() {
        System.out.println("\nExercise 23 - Number To Words - Section 5");
        System.out.println(getDigitCount(0)); // should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); // should return 3
        System.out.println(getDigitCount(-12)); // should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); // should return 4 since there are 4 digits in the number

        System.out.println(reverse(-121)); // should  return -121
        System.out.println(reverse(1212)); // should return  2121
        System.out.println(reverse(1234)); // should return 4321
        System.out.println(reverse(100)); // should return 1

        numberToWords(123); // should print "One Two Three".
        numberToWords(1010); // should print "One Zero One Zero".
        numberToWords(1000); // should print "One Zero Zero Zero".
        numberToWords(-12); // should print "Invalid Value" since the parameter is negative.
    }

    private static void ex24() {
        System.out.println("\nExercise 24 - Flour Pack Problem - Section 5");
        System.out.println(canPack(1, 0, 4)); // should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println(canPack(1, 0, 5)); // should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        System.out.println(canPack(0, 5, 4)); // should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
        System.out.println(canPack(2, 2, 11)); // should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
        System.out.println(canPack(-3, 2, 12)); // should return false since bigCount is negative.
    }

    private static void ex25() {
        System.out.println("\nExercise 25 - Largest Prime - Section 5");
        System.out.println(getLargestPrime(21)); // should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(217)); // should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(0)); // should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(45)); // should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(-1)); // should return -1 since the parameter is negative
    }
}
