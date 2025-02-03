package design_patterns.decorator;

/**
 * Replaces specific letters in the password with specific symbols
 * @author Victoria
 */
class Symbols extends PasswordDecorator {
    /**
     * Takes a password and replaces specific letters with symbols
     * @param passwordBeginning The original password
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns the password with some letters replaced by symbols.
     * a => @
     * b => 8
     * e => 3
     * g => 9
     * i => !
     * o => 0
     * s => $
     * t => 7
     * @return The password with replaced symbols.
     */
    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original.replace("a", "@").replace("b", "8").replace("e", "3")
                .replace("g", "9").replace("i", "!").replace("o", "0")
                .replace("s", "$").replace("t", "7");
    }
}
