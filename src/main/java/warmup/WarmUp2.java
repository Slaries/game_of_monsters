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

}
