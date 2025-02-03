package design_patterns.decorator;

import java.util.Random;

/**
 * This class adds random special characters to a password with a 30% chance after each letter
 * @author Victoria
 */
class SpecialChars extends PasswordDecorator {
    private static final char[] SPECIAL_CHARS = {'*', '!', '%', '+', '.', '{', '}'};

    /**
     * Adds random special characters after some letters
     * @param passwordBeginning The original password
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with random special characters added after some letters.
     * @return The password with added special characters
     */
    @Override
    public String getPassword() {
        StringBuilder modified = new StringBuilder();
        Random random = new Random();
        for (char ch : passwordBeginning.getPassword().toCharArray()) {
            modified.append(ch);
            if (Character.isLetter(ch) && random.nextInt(10) < 3) { // 30% chance
                modified.append(SPECIAL_CHARS[random.nextInt(SPECIAL_CHARS.length)]);
            }
        }
        return modified.toString();
    }
}
