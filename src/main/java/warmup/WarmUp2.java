package warmup;

public class WarmUp2 {
    /*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     */

    public static String stringTimes(String str, int n) {
        StringBuilder temp = new StringBuilder("");
        for (int i = 0; i < n; i++){
            temp.append(str);
        }
        return temp.toString();
    }

    /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
    * or whatever is there if the string is less than length 3. Return n copies of the front;
     */
    public static String frontTimes(String str, int n) {
        StringBuilder temp = new StringBuilder("");
        int a = str.length();
        for (int i = 0; i < n; i++){
            if (a >= 3){
                temp.append(str.substring(0,3));
            }else{
                temp.append(str.substring(0,a));
            }
        }
        return temp.toString();
    }
    /* Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */
    int countXX(String str) {
        int a = str.length();
        int count = 0;
        char x = 'x';
        for (int i = 0; i < (a-1); i++){
            if ((str.charAt(i) == x) && (str.charAt(i+1) == x)){
                count += 1;
            }
        }
        return count;
    }
    /* Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     */

    boolean doubleX(String str) {
        int length = str.length();
        if (length < 2)
            return false;
        int index = str.indexOf('x');
        if (index + 1 >= length)
            return false;
        return str.charAt(index + 1) == 'x';
    }

    /* Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     */
    public static String stringBits(String str) {
        StringBuilder temp = new StringBuilder("");
        int a = str.length();
        for (int i = 0; i < a && a >= 2; i += 2){
            temp.append (str.charAt(i));
        }
        return temp.toString();
    }
    /* Given a non-empty string like "Code" return a string like "CCoCodCode".
     */
    public static String stringSplosion(String str) {
        String temp = "";
        int length = str.length();
        if (length < 2 )
            return temp = str;

        for(int i =  0; i < length;i++){
            temp = str.substring(0,length - i) + temp;
        }
        return temp;
    }
    /* Given an array of ints, return the number of 9's in the array.
     */
    public static int arrayCount9(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length;i++){
            if (nums[i] == 9)
                count++;
        }
        return count;
    }
    /* Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    * The array length may be less than 4.
     */
    public boolean arrayFront9(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length && i < 3;i++){
            if (nums[i] == 9)
                result = true;
        }
        return result;
    }
}
