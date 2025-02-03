package design_patterns.decorator;

import java.util.Random;

class RandomCasing extends PasswordDecorator {
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuilder modified = new StringBuilder();
        Random random = new Random();
        for (char ch : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(ch)) {
                modified.append(random.nextBoolean() ? Character.toUpperCase(ch) : Character.toLowerCase(ch));
            } else {
                modified.append(ch);
            }
        }
        return modified.toString();
    }
}
