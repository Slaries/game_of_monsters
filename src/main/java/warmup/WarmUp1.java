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
    public static boolean makes10(int a, int b) {
        return (a >= 10 || b >= 10) || (a+b == 10);
    }
    public static boolean nearHundred(int n) {
        return (10>= Math.abs(100-n))||(10>= Math.abs(200-n));
    }
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && ((hour<7)||(hour>20));
    }
    public static int diff21(int n) {
        if (n<21){
            return 21-n;
        }else {
            return (n-21)*2;
        }
    }
}



/*

monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false

*/

