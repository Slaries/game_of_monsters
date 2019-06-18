import warmup.WarmUp2;
import warmup.WarmUp1;
import warmup.WarmUp3;

public class Main {
    public static void main(String[] args) {
        boolean result = WarmUp1.sleepIn (false, false);
        boolean monkay = WarmUp1.monkeyTrouble(true, true);
        int sumDouble = WarmUp1.sumDouble(3, 2);
    System.out.println(result);
    System.out.println("Question about monkey " + monkay);
        System.out.println("Дабл сумм " + sumDouble);
    }
}