package design_patterns.decorator;

class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        return original.replace("a", "@").replace("b", "8").replace("e", "3")
                .replace("g", "9").replace("i", "!").replace("o", "0")
                .replace("s", "$").replace("t", "7");
    }
}
