package section4;

public class ex2_MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String message = "Invalid Value";

        if (kiloBytes >= 0) {
            message = String.format("%d KB = %d MB and %d KB", kiloBytes, kiloBytes / 1024, kiloBytes % 1024);
        }

        System.out.println(message);
    }
}
