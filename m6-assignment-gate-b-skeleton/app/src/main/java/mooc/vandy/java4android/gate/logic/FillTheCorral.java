package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gates, Random selectDirection) {
        //Loop through each of the gates
        for(Gate gate : gates) {
            if(selectDirection.nextBoolean()) {
                gate.open(Gate.IN);
            } else {
                gate.open(Gate.OUT);
            }
            mOut.println("Gate " +  gate.toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        for(Gate aCorral : corral) {
            if (aCorral.getSwingDirection() == Gate.IN) {
                return true;
            }
        }
        return false;
    }

    public int corralSnails(Gate[] corral, Random rand) {
        int snailOut = 5;
        int attempts = 0;
        //Keep looping until those suckers are all corralled up
        while(snailOut > 0) {
            attempts += 1;
            int gateNumber = new Random().nextInt(4) + 1;
            int snail = rand.nextInt(snailOut);
            if(corral[gateNumber].getSwingDirection() == Gate.IN) {
                snailOut -= snail;
            } else {
                snailOut += snail;
            }
            mOut.println(snail + " are trying to move through coral " + gateNumber);
        }
        mOut.println("It took " + attempts + " attempts to coral all of the snails.");
        return attempts;
    }

}
