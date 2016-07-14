package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {

    int quotient;
    int remainder;
    String resultString;

    public void divide(int arg1, int arg2) {

        // try dividing arg1 and arg2
        // if 0 is passed as the arg2
        // then throw an exception
        try {

            quotient = arg1/arg2;
            remainder = arg1 % arg2;

            resultString = String.valueOf(quotient) + " R: " + remainder;


        } catch (ArithmeticException e) {

            resultString = "Division by zero is not allowed.";
        }
    }

    public String getResultString() {
        return resultString;
    }

}
