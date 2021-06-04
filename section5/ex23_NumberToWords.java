package section5;

import java.util.HashMap;
import java.util.Map;

public class ex23_NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int digitCount = getDigitCount(number);
        int reverse = reverse(number);
        Map<Integer, String> numberToWords = new HashMap<>();
        numberToWords.put(0, "Zero");
        numberToWords.put(1, "One");
        numberToWords.put(2, "Two");
        numberToWords.put(3, "Three");
        numberToWords.put(4, "Four");
        numberToWords.put(5, "Five");
        numberToWords.put(6, "Six");
        numberToWords.put(7, "Seven");
        numberToWords.put(8, "Eight");
        numberToWords.put(9, "Nine");

        while (digitCount > 0) {
            int lastDigit = reverse % 10;
            System.out.println(numberToWords.get(lastDigit));
            reverse /= 10;
            digitCount--;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int comparison = Math.abs(number);

        while (comparison > 0) {
            int lastDigit = comparison % 10;
            reverse *= 10;
            reverse += lastDigit;
            comparison /= 10;
        }

        return number < 0 ? -reverse : reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int digitCount = 0;

        while (number > 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }
}
