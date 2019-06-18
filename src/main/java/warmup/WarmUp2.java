package warmup;

public class WarmUp2 {
    public static boolean monkeyTrouble(boolean aMonkay, boolean bMonkey) {
        return (aMonkay && bMonkey) || (!aMonkay && !bMonkey);
    }
}

/*
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
 */
