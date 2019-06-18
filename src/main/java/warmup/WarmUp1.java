package warmup;

public class WarmUp1 {

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
    public static int sumDouble(int a, int b) {
        if (a != b){
            return a + b;
        }
        return (a + b) * 2;
    }
}

/*

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

*/

