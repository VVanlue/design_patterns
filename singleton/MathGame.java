import java.util.ArrayList;
import java.util.Iterator;

/**
 * Manages a math game with questions
 * @author Victoria
 */
public class MathGame {
    public static final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
     * Creates a math game with questions
     */
    private MathGame() {
        questions = new ArrayList<>();
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            questions.add(new Question());
        }
    }

    /**
     * Gets the math game instance
     * @return the math game instance
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Gets an iterator for questions
     * @return an iterator for questions
     */
    public Iterator<Question> getIterator() {
        return questions.iterator();
    }
}