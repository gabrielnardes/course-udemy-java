package section5;

public class ex15_NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int comparison = Math.abs(number);

        while (comparison > 0) {
            int lastDigit = comparison % 10;
            reverse *= 10;
            reverse += lastDigit;
            comparison /= 10;
        }

        return reverse == Math.abs(number) ? true : false;
    }
}
