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

        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a > 0 && b < 0) || (a < 0 && b > 0)) ;
        }
    }

    /* Given a string, return a new string where "not " has been added to the front.
    * However, if the string already begins with "not", return the string unchanged.
    * Note: use .equals() to compare 2 strings.
     */
    public static String notString(String str) {
        int c = str.length();
        String b = "not";
        if (c >= 3 && str.substring(0, 3).equals(b)) {
            return str;
        }else{
            return str = "not " + str;
        }
    }

    /* Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    * The value of n will be a valid index of a char in the original string
    * (i.e. n will be in the range 0..str.length()-1 inclusive).
     */
    public static String missingChar(String str, int n) {
        int a = str.length();
        if ( n < a ){
            return (str.substring(0,n) + str.substring(n + 1));
        }else{
            return (str.substring(n));
        }
    }
    /* Given a string, return a new string where the first and last chars have been exchanged.
   * frontBack("code") → "eodc"
   * frontBack("a") → "a"
   * frontBack("ab") → "ba"
   */
    public static String frontBack(String str) {
        int a = str.length();
        if ( 2 <= a ){
            return (str.substring(a - 1)  + str.substring(1,a - 1)+ str.substring(0,1));
        }else{
            return str;
        }
    }

    /* Given a string, we'll say that the front is the first 3 chars of the string.
    * If the string length is less than 3, the front is whatever is there.
    * Return a new string which is 3 copies of the front.
     */
    public static String front3(String str) {
        String result;
        int a = str.length() ;
        if (3 <= a){
            result = str.substring(0,3);
        }else{
            result= str;
        }
        return (result + result + result);
    }

    /*Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    *backAround("cat") → "tcatt"
    *backAround("Hello") → "oHelloo"
    *backAround("a") → "aaa"
     */
    public static String backAround(String str) {
        int a = str.length();
        if ( 1 < a ){
            return (str.substring(a - 1) + str  + str.substring(a - 1));
        }else{
            return str + str + str;
        }
    }

    /*
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
    * or35(3) → true
    * or35(10) → true
    *  or35(8) → false
     */
    public static boolean or35(int n) {
        return (( n % 3 <= 0) || ((n % 5)<= 0) );
    }

    /* Given a string, return true if the string starts with "hi" and false otherwise.
   * startHi("hi there") → true
   * startHi("hi") → true
   * startHi("hello hi") → false
     */
    public static boolean startHi(String str) {
        int a = str.length();
        return ((a >= 2) && ("hi".equals(str.substring(0, 2))));
    }

    /* Given two temperatures, return true if one is less than 0 and the other is greater than 100.
     */

    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }

    /* Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */
    public static boolean in1020(int a, int b) {
        return (a <= 20 && a >= 10) || (b <= 20 && b >= 10);
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    * Given 3 int values, return true if 1 or more of them are teen.
     */
    public static boolean hasTeen(int a, int b, int c) {

        return ((a >= 13 && a<= 19) || (b >= 13 && b<= 19) || (c >= 13 && c<= 19));
    }

    /* We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    * Given 2 int values, return true if one or the other is teen, but not both.
     */
}
