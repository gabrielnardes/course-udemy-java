package section5;

public class ex24_FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (5 * bigCount + smallCount < goal) {
            return false;
        }

        return goal % 5 <= smallCount;
    }
}
