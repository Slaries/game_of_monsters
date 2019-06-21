package warmup;

public class WarmUp1 {

    /* The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     */
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /* We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    * We are in trouble if they are both smiling or if neither of them is smiling.
    * Return true if we are in trouble.
    */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /* Given two int values, return their sum.
    * Unless the two values are the same, then return double their sum.
    */
    public static int sumDouble(int a, int b) {
        if (a != b){
            return a + b;
        }
        return (a + b) * 2;
    }

    /* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    */
    public static boolean makes10(int a, int b) {
        return (a >= 10 || b >= 10) || (a+b == 10);
    }

    /*Given an int n, return true if it is within 10 of 100 or 200.
    * Note: Math.abs(num) computes the absolute value of a number.
    */
    public static boolean nearHundred(int n) {
        return (10 >= Math.abs(100  -n)) || ( 10 >= Math.abs( 200 - n ));
    }

    /* We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    * Return true if we are in trouble.
    */
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && ((hour < 7) || (hour > 20));
    }

    /* Given an int n, return the absolute difference between n and 21,
    * except return double the absolute difference if n is over 21.
    */
    public static int diff21(int n) {
        if (n < 21){
            return 21 - n;
        }else {
            return ( n - 21 ) * 2;
        }
    }

    /* Given 2 int values, return true if one is negative and one is positive.
    * Except if the parameter "negative" is true, then return true only if both are negative.
    */

    public static boolean posNeg(int a, int b, boolean negative) {
        boolean result = true;
        if ((a < 0 && b < 0 && negative == true) || (((a > 0 && b < 0) || (a < 0 && b > 0)) && (negative != true))) {
            return result;
        } else {
            return result = false ;
        }
    }

}


