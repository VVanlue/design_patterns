package design_patterns.decorator;

/**
 * Makes a password into a palindrome by adding the reverse of the password to the end
 * @author Victoria
 */
class Pallendrome extends PasswordDecorator{
    /**
     * Turns existing password into a palindrome
     * @param passwordBeginning The original password to be turned into a palindrome
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with its reverse added at the end
     * @return The palindromed password
     */
    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
}
