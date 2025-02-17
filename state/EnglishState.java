/**
 * Represents the state when the music box is in English mode.
 * Handles behavior after pressing the English, French, and Spanish buttons
 * @author Victoria
 */
public class EnglishState extends State {
    
    /**
     * English version of Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "design_patterns/state/songs/twinkle-english.txt";
    
    /**
     * English version of If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "design_patterns/state/songs/happy-english.txt";

    /**
     * EnglishState for the given MusicBox
     * Initializes with English lyrics for the songs
     * @param box The MusicBox for this state
     */
    public EnglishState(MusicBox box) {
        super(box, TWINKLE_FILE_NAME, HAPPY_FILE_NAME);
    }

    /**
     * After pressing the English button and the box is already in English mode
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Already in English mode.");
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
     * After pressing the Spanish button it switches the state to Spanish
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish.");
        box.setState(box.getSpanishState());
    }
}