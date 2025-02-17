import java.util.Random;

/**
 * Creates a math question with random numbers and an operand
 * @author Victoria
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Creates a random math question and calculates the answer
     */
    public Question() {
        Random rand = new Random();
        num1 = rand.nextInt(100) + 1;
        num2 = rand.nextInt(100) + 1;
        operand = Operand.values()[rand.nextInt(Operand.values().length)];
        
        switch (operand) {
            case PLUS:
                answer = num1 + num2;
                break;
            case MINUS:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
        }
    }

    /**
     * Gets the question as a string
     * @return the math question
     */
    public String getQuestion() {
        return num1 + " " + operand.label + " " + num2 + " = ";
    }

    /**
     * Sets the user's answer
     * @param answer the user's input
     */
    public void setUserAnwer(int answer) {
        this.userAnswer = answer;
    }

    /**
     * Checks if the user's answer is correct
     * @return true if correct false if not
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /**
     * Gets the question and answer as a formatted string
     * @return the formatted question and answer
     */
    @Override
    public String toString() {
        String result = num1 + " " + operand.label + " " + num2 + " = " + answer;
        if (userAnswer != answer) {
            result += " You answered " + userAnswer;
        }

        if (isCorrect()) {
            return ANSI_GREEN + result + ANSI_BLACK;
        } else {
            return ANSI_RED + result + ANSI_BLACK;
        }
    }
}