package design_patterns.decorator;

class Pallendrome extends PasswordDecorator{
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original + new StringBuilder(original).reverse().toString();
    }
}
