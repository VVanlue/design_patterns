import java.util.ArrayList;

/**
 * Represents a state in the music box and handles the behavior for pressing buttons to play the songs in different languages
 * 
 * @author Victoria
 */
public abstract class State {
    
    /**
     * The MusicBox in this State
     */
    protected MusicBox box;
    
    /**
     * The lyrics for Twinkle Twinkle Little Star
     */
    private ArrayList<String> starLyrics;
    
    /**
     * The lyrics for If You're Happy and You Know It
     */
    private ArrayList<String> happyLyrics;

    /**
     * Constructs a State for the given MusicBox
     * Initializes the state with the provided lyrics for the songs
     * 
     * @param box The MusicBox
     * @param twinkleFileName The file name for the Twinkle Twinkle Little Star song lyrics.
     * @param happyFileName The file name for the If You're Happy and You Know It song lyrics.
     */
    public State(MusicBox box, String twinkleFileName, String happyFileName) {
        this.box = box;
        this.starLyrics = FileReader.getLyrics(twinkleFileName);
        this.happyLyrics = FileReader.getLyrics(happyFileName);
    }

    /**
     * Presses the "Twinkle Twinkle Little Star" button
     * It plays the song in the current state with the right lyrics
     */
    public void pressStarButton() {
        box.playSong("Twinkle Twinkle Little Star", starLyrics);
    }

    /**
     * Presses the "If You're Happy and You Know It" button
     * It plays the song in the current state with the right lyrics
     */
    public void pressHappyButton() {
        box.playSong("If You're Happy and You Know It", happyLyrics);
    }

    /**
     * Presses English button, can result in a switch of language or a message saying you're in English mode already
     */
    public abstract void pressEnglishButton();

    /**
     * Presses French button, can result in a switch of language or a message saying you're in French mode already
     */
    public abstract void pressFrenchButton();

    /**
     * Presses Spanish button, can result in a switch of language or a message saying you're in Spanish mode already
     */
    public abstract void pressSpanishButton();
}