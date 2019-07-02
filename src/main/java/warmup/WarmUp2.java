package warmup;

public class WarmUp2 {
    public static String stringTimes(String str, int n) {
        StringBuilder temp = new StringBuilder("");
        for (int i = 0; i < n; i++){
            temp.append(str);
        }
        return temp.toString();
    }
}
