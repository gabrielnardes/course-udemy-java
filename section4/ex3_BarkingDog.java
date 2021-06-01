package section4;

public class ex3_BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeUp = false;

        if ((hourOfDay >= 0 && hourOfDay <= 23) && (hourOfDay < 8 || hourOfDay > 22) && barking == true) {
            wakeUp = true;
        }

        return wakeUp;
    }
}
