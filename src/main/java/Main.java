import warmup.WarmUp2;
import warmup.WarmUp1;

public class Main {
    public static void main(String[] args) {
        boolean result = WarmUp1.sleepIn (false, false);
        boolean monkay = WarmUp2.monkeyTrouble(true, true);
    System.out.println(result);
    System.out.println("Question about monkey " + monkay);
    }
}