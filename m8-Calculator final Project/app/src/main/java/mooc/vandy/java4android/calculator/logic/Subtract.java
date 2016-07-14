package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {

    int difference;

    public void  subtract(int arg1, int arg2) {

        difference = arg1 - arg2;
    }

    public String getResultString() {
        return String.valueOf(difference);
    }
}
