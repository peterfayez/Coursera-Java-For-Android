package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * no. of herds i.e size of escargatoire
     */
    private static final int HERD = 24;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public void simulateHerd(Random rand){
        // local variables inside the method
        int gate;
        int snailsIn = HERD; //Number of snails inside, initially equal to herd
        int snailsOut = 0;
        int temp;
        final int EAST = 1;

        mOut.println("There are currently "+ snailsIn+ " snails in the pen and "+ snailsOut + " snails in the pasture");

        /**
         * Simulation
         */
        for(int i=0;i<MAX_ITERATIONS;i++){

            if(snailsIn==0){ //Snails can only move out
                temp = rand.nextInt(snailsOut)+1;
                snailsIn += mWestGate.thru(temp);
                snailsOut =HERD - snailsIn;
            }
            else if(snailsIn==HERD){  //Snails can only move in
                temp = rand.nextInt(snailsIn)+1;
                snailsIn += mEastGate.thru(temp);
                snailsOut = HERD - snailsIn;
            }
            else {
                gate = rand.nextInt(2);
                //push them out
                if(gate==EAST) {
                    temp = rand.nextInt(snailsIn)+1;
                    snailsIn += mEastGate.thru(temp);

                    snailsOut = HERD - snailsIn;
                }
                //put them in
                else {
                    temp = rand.nextInt(snailsOut)+1;
                    snailsIn += mWestGate.thru(temp);
                    snailsOut = HERD - snailsIn;
                }
            }

            mOut.println("There are currently "+ snailsIn+ " snails in the pen and "+ snailsOut + " snails in the pasture");
        }
    }


}
