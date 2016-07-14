package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {

    int sum;

    public void add (int arg1, int arg2) {
        sum = arg1 + arg2;
    }

    public String getResultString() {
        return String.valueOf(sum);
    }
}
