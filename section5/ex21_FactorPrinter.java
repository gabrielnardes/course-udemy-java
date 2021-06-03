package section5;

public class ex21_FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        int factor = 1;

        while (factor <= number/2) {
            if (number % factor == 0) {
                System.out.printf("%d ", factor);
            }

            factor++;
        }

        System.out.println();
    }
}
