package mooc.vandy.java4android.shapes.ui;

import mooc.vandy.java4android.shapes.logic.Shapes;

/**
 * Define the methods that the User Interface [MainActivity] will
 * implement.  You can ignore this interface for now since interfaces
 * will be covered later in this course.
 */
public interface OutputInterface {
    /**
     * Get the shape specified by the user.
     */
    public Shapes getShape();

    /**
     * Get the length.
     */
    public double getLength();

    /**
     * Get the width.
     */
    public double getWidth();

    /**
     * Get the height.
     */
    public double getHeight();

    /**
     * Get the radius.
     */
    public double getRadius();

    /**
     * This prints to the output a string
     * @param text
     */
    public void print(String text);

    /**
     * This prints to the output a char
     * @param _char
     */
    public void print(char _char);

    /**
     * This prints to the screen a string then a new line
     * @param text
     */
    public void println(String text);

    /**
     * This prints to the screen a char then a new line
     * @param _char
     */
    public void println(char _char);

    /**
     * Reset the on-screen output (EditText box).
     */
    public void resetText();

    /**
     * Log the @a logtext to logcat.
     */
    public void log(String logtext);
}
