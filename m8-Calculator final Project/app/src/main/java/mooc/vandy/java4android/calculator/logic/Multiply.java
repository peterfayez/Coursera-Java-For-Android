package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    int multiplyResult;

    public void multiply(int arg1, int arg2) {
        multiplyResult = arg1 * arg2;
    }

    public String getResultString() {
        return String.valueOf(multiplyResult);
    }
}
