package section5;

public class ex25_LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int largestPrime = 2;

        while (number % 2 == 0) {
            number /= 2;
        }

        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                number /= i;
                largestPrime = i;
            }
        }

        return largestPrime;
    }
}
