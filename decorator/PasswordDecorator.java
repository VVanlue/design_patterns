package design_patterns.decorator;

/**
 * reates different types of password decorators
 * @author Victoria
 */
abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    /**
     * Sets the original password
     * @param passwordBeginning The original password that will be decorate
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * Gets the decorated password
     * @return The decorated password.
     */
    @Override
    public abstract String getPassword();
}
