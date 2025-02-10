/**
 * Represents the state when the music box is in Spanish mode.
 * Handles behavior after pressing the English, French, and Spanish buttons
 * @author Victoria
 */
public class SpanishState extends State {
    
    /**
     * Spanish version of Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "design_patterns/state/songs/twinkle-spanish.txt";
    
    /**
     *  Spanish version of If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "design_patterns/state/songs/happy-spanish.txt";

    /**
     * SpanishState for the given MusicBox
     * Initializes with Spanish lyrics for the songs
     * @param box The MusicBox for this state
     */
    public SpanishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * After pressing the English button it switches the state to English
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English.");
        box.setState(box.getEnglishState());
    }

    /**
     * After pressing the French button it switches the state to French
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French.");
        box.setState(box.getFrenchState());
    }

    /**
     * After pressing the Spanish button and the box is already in Spanish mode
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish mode.");
    }
}