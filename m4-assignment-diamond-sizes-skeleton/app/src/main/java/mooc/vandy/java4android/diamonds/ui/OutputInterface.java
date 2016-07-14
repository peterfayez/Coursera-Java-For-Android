package mooc.vandy.java4android.diamonds.ui;

/**
 * Define the methods that the User Interface [MainActivity] will
 * implement. Ignore this interface for now - they will be covered
 * later in this course.
 */
public interface OutputInterface {
    /**
     * Return the string.
     */
    public String getString();

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
     * Reset the on-screen output (EditText box)
     */
    public void resetText();

    /**
     * Log @a logtext to the logcat.
     */
    public void log(String logtext);
}
