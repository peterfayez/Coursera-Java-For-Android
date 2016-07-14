package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    /*variable for swing direction*/
    public static final int IN = 1;
    public static final int OUT = -1;
    public static final int CLOSED = 0;
    public int mSwing;

    public boolean setSwing (int direction) {
        if (direction == IN || direction == OUT){
            mSwing = direction;
            return true;
        }
        else
            return false;
    }

    public boolean open (int direction) {
        if (direction == IN || direction == OUT){
            setSwing(direction);
            return true;
        }
        else
            return false;
    }

    public void close(){
        mSwing=0;
    }

    public int getSwingDirection(){
        return mSwing;
    }

    public int thru(int count) {
        if (mSwing == IN)
            return count;
        else if (mSwing == OUT) {
            return -count;
        }
        else
            return 0;

    }

    public String toString(){
       if (mSwing == CLOSED)
           return "This gate is closed";
       else if (mSwing == IN){
           return "This gate is open and swings to enter the pen only";
       }
        else if (mSwing == OUT){
           return "This gate is open and swings to exit the pen only";
       }
        else
           return "This gate has an invalid swing direction";


    }

}
