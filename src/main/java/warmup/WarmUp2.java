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
        for (int i = 0; i<a && a >= 2; i += 2){
            temp.append (str.charAt(i));
        }
        return temp.toString();
    }
}
