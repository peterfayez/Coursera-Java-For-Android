package mooc.vandy.java4android.diamonds.logic;

import org.junit.Before;
import org.junit.Test;

import io.magnum.autograder.junit.Rubric;
import mooc.vandy.java4android.diamonds.logic.tools.TestingOutputInterface;

import static org.junit.Assert.*;

import java.util.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LogicUnitTests {

    // The variables that are used in each test.
    Logic mLogic;
    TestingOutputInterface mOutput;

    // This runs before each method with a '@Test' annotation.
    //
    // This entire class is re-created for each test method below. Therefore, 'setup'
    // operations such as these that need to be ran 'before' each test are in this method.
    @Before
    public void setupClasses(){
        mOutput = new TestingOutputInterface();
        mLogic = new Logic(mOutput);
    }

    @Rubric(
            value="testDiamond1",
            goal="The goal of this evaluation is to test Diamond 1",
            points=10.0,
            reference="This Test fails when: The Diamond size 1 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond1() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+--+",
                "|<>|",
                "+--+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(1);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }

    @Rubric(
            value="testDiamond2",
            goal="The goal of this evaluation is to test Diamond 2",
            points=10.0,
            reference="This Test fails when: The Diamond size 2 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond2() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+----+",
                "| /\\ |",
                "|<-->|",
                "| \\/ |",
                "+----+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(2);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }

    @Rubric(
            value="testDiamond3",
            goal="The goal of this evaluation is to test Diamond 3",
            points=10.0,
            reference="This Test fails when: The Diamond size 3 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond3() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+------+",
                "|  /\\  |",
                "| /--\\ |",
                "|<====>|",
                "| \\--/ |",
                "|  \\/  |",
                "+------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(3);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }

    @Rubric(
            value="testDiamond4",
            goal="The goal of this evaluation is to test Diamond 4",
            points=10.0,
            reference="This Test fails when: The Diamond size 4 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond4() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+--------+",
                "|   /\\   |",
                "|  /--\\  |",
                "| /====\\ |",
                "|<------>|",
                "| \\====/ |",
                "|  \\--/  |",
                "|   \\/   |",
                "+--------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(4);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }

    @Rubric(
            value="testDiamond5",
            goal="The goal of this evaluation is to test Diamond 5",
            points=10.0,
            reference="This Test fails when: The Diamond size 5 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond5() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+----------+",
                "|    /\\    |",
                "|   /--\\   |",
                "|  /====\\  |",
                "| /------\\ |",
                "|<========>|",
                "| \\------/ |",
                "|  \\====/  |",
                "|   \\--/   |",
                "|    \\/    |",
                "+----------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(5);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }

    @Rubric(
            value="testDiamond6",
            goal="The goal of this evaluation is to test Diamond 6",
            points=10.0,
            reference="This Test fails when: The Diamond size 6 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond6() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+------------+",
                "|     /\\     |",
                "|    /--\\    |",
                "|   /====\\   |",
                "|  /------\\  |",
                "| /========\\ |",
                "|<---------->|",
                "| \\========/ |",
                "|  \\------/  |",
                "|   \\====/   |",
                "|    \\--/    |",
                "|     \\/     |",
                "+------------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(6);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }


    @Rubric(
            value="testDiamond7",
            goal="The goal of this evaluation is to test Diamond 7",
            points=10.0,
            reference="This Test fails when: The Diamond size 7 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond7() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+--------------+",
                "|      /\\      |",
                "|     /--\\     |",
                "|    /====\\    |",
                "|   /------\\   |",
                "|  /========\\  |",
                "| /----------\\ |",
                "|<============>|",
                "| \\----------/ |",
                "|  \\========/  |",
                "|   \\------/   |",
                "|    \\====/    |",
                "|     \\--/     |",
                "|      \\/      |",
                "+--------------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(7);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }


    @Rubric(
            value="testDiamond8",
            goal="The goal of this evaluation is to test Diamond 8",
            points=10.0,
            reference="This Test fails when: The Diamond size 8 is wrong"
    )
    @Test(timeout=100)
    public void testDiamond8() {

        ArrayList<String> actual = new ArrayList<String>();

        String [] expected = {
                "+----------------+",
                "|       /\\       |",
                "|      /--\\      |",
                "|     /====\\     |",
                "|    /------\\    |",
                "|   /========\\   |",
                "|  /----------\\  |",
                "| /============\\ |",
                "|<-------------->|",
                "| \\============/ |",
                "|  \\----------/  |",
                "|   \\========/   |",
                "|    \\------/    |",
                "|     \\====/     |",
                "|      \\--/      |",
                "|       \\/       |",
                "+----------------+"};

        String output = "";

        mOutput.resetText();
        mLogic.process(8);

        try {
            output = mOutput.getString();
            Scanner scanner = new Scanner(output);
            while (scanner.hasNext()) {
                actual.add(scanner.nextLine());
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        for (int i = 0; i < expected.length; ++i) {
            assertEquals(true, expected[i].equals(actual.get(i)));
        }

    }
}
