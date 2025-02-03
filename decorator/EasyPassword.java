package design_patterns.decorator;

import java.util.Random;

public class EasyPassword extends Password {
    public EasyPassword(String phrase) {
        this.password = phrase.replace(" ", "-") + new Random().nextInt(101);
    }
}
