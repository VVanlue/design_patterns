package design_patterns.decorator;

import java.util.Random;

/**
 * Creates a simple password by replacing spaces with dashes and adding random number at the end
 * @author Victoria
 */
public class EasyPassword extends Password {
    /**
     * Makes a password from the given phrase.
     * @param phrase The words used to make the password.
     */
    public EasyPassword(String phrase) {
        this.password = phrase.replace(" ", "-") + new Random().nextInt(101);
    }
}
