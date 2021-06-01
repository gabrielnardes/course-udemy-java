package section4;

public class ex9_MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%d min = %d y and %d d\n", minutes, minutes/(365*24*60), (minutes%(365*24*60))/(24*60));
        }
    }
}
