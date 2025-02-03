package design_patterns.decorator;

abstract class PasswordDecorator extends Password{
    protected Password passwordBeginning;

    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    @Override
    public abstract String getPassword();
}
