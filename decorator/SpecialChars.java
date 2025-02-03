package design_patterns.decorator;

import java.util.Random;

class SpecialChars extends PasswordDecorator {
    private static final char[] SPECIAL_CHARS = {'*', '!', '%', '+', '.', '{', '}'};

    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

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
