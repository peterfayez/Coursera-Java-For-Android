package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

        // TODO -- add your code here
        printTop(size);
        // for upper triangle
        for(int i=1;i<size;i++)
        {
            mOut.print("\n");
            mOut.print("|");
            drawTop(size,i);
            mOut.print("/");
            for(int k=1;k<=(2*(i-1));k++)
            {
                if(i%2==0)
                    mOut.print("-");
                else
                    mOut.print("=");
            }
            mOut.print("\\");
            drawTop(size,i);
            mOut.print("|");
        }
        /*The following code is to print the middle line */
        mOut.print("\n");
        mOut.print("|");
        mOut.print("<");
        for(int j=1;j<=(2*(size-1));j++)
        {
            if(size%2==0)
                mOut.print("-");
            else
                mOut.print("=");
        }
        mOut.print(">");
        mOut.print("|");
        /*The following code is to print the lower half of the triangle to complete the diamond*/
        for(int i=1;i<size;i++) {
            mOut.print("\n");
            mOut.print("|");
            for (int j = 1; j <= i; j++)
                mOut.print(" ");
            mOut.print("\\");
            for (int k = 1; k <= (2 * (size - i - 1)); k++) {
                if ((size + i) % 2 == 0)
                    mOut.print("-");
                else
                    mOut.print("=");
            }
            mOut.print("/");
            for (int l = 1; l <= i; l++)
                mOut.print(" ");
            mOut.print("|");
        }
        mOut.print("\n");
        printTop(size);

    }

    // TODO -- add your code here
    public void printTop(int count){
        mOut.print("+");
        for(int i=1;i<=(2*count);i++)
            mOut.print("-");
        mOut.print("+");

    }
    public void drawTop(int n,int i )
    {
        /*The code below prints the desired number of spaces in the upper triangle*/
        for(int j=1;j<=(n-i);j++)
            mOut.print(" ");
    }
   
}
