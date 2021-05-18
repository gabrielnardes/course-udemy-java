package com.company;

public class ex14_SumOddRange {
    public static boolean isOdd(int n) {
        return n > 0 && n % 2 != 0 ? true : false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        if (start <= 0 || end <= 0 || end < start) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
