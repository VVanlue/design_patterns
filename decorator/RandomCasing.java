package design_patterns.decorator;

import java.util.Random;

/**
 * Changes the case of letters in a password, making each letter randomly uppercase or lowercase
 * @author Victoria
 */
class RandomCasing extends PasswordDecorator {
    
    /**
     * Randomly changes the case of each letter
     * @param passwordBeginning The original password to be changed
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with random casing for each letter
     * @return The password with random casing
     */
    @Override
    public String getPassword() {
        StringBuilder modified = new StringBuilder();
        Random random = new Random();
        for (char ch : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(ch)) {
                modified.append(random.nextBoolean() ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
            } else {
                modified.append(ch); // Non-letter characters are not changed
            }
        }
        return modified.toString();
    }
}
