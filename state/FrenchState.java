/**
 * Represents the state when the music box is in French mode.
 * Handles behavior after pressing the English, French, and Spanish buttons
 * @author Victoria
 */
public class FrenchState extends State {
    
    /**
     * French version of Twinkle Twinkle Little Star
     */
    private static final String TWINKLE_FILE_NAME = "design_patterns/state/songs/twinkle-french.txt";
    
    /**
     * French version of If You're Happy and You Know It
     */
    private static final String HAPPY_FILE_NAME = "design_patterns/state/songs/happy-french.txt";

    /**
     * FrenchState for the given MusicBox
     * Initializes with French lyrics for the songs
     * @param box The MusicBox for this state
     */
    public FrenchState(MusicBox box) {
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
     * After pressing the French button and the box is already in French mode
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French mode.");
    }

    /**
     * After pressing the Spanish button  it switches the state to Spanish mode.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish.");
        box.setState(box.getSpanishState());
    }
}