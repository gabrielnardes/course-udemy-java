package section5;

public class ex22_PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int factor = 1;
        int sum = 0;

        while (factor <= number/2) {
            if (number % factor == 0) {
                sum += factor;
            }
            factor++;
        }

        return number == sum ? true : false;
    }
}
