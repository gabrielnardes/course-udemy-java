package section5;

public class ex19_LastDigitChecker {
    public static boolean hasSameLastDigit(int A, int B, int C) {
        if (!isValid(A) || !isValid(B) || !isValid(C)) {
            return false;
        }

        int a = A % 10;
        int b = B % 10;
        int c = C % 10;

        if (a == b ||
            a == c ||
            b == c) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int n) {
        if (n < 10 || n > 1000) {
            return false;
        }

        return true;
    }
}
