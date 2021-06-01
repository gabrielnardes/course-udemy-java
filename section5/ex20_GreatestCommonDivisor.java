package section5;

public class ex20_GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int gcd = first < second ? first : second;

        boolean foundGcd = false;

        while(!foundGcd) {
            if (first % gcd == 0 &&
                second % gcd == 0) {
                foundGcd = true;
            } else {
                gcd--;
            }
        }

        return gcd;
    }
}
