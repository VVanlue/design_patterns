import java.util.ArrayList;

/**
 * A music box that can play songs in different languages.
 * It handles the behavior for pressing buttons to switch between languages and songs
 * @author Victoria
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructs a MusicBox and initializes states for English, French, and Spanish
     * Sets the default state to English
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState; // Default state
    }

    /**
     *"Twinkle Twinkle Little Star" song button.
     *
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * "If You're Happy and You Know It" song button.
     * 
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * English language button
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * French language button
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * spanish language button
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Sets  current state of the MusicBox
     * 
     * @param state The new state to set
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Gets the state for English mode
     * 
     * @return The EnglishState
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Gets the state for French modee
     * 
     * @return The FrenchState
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Gets the state for Spanish mode
     * 
     * @return The SpanishState
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays a song with the given name and lyrics
     * 
     * @param songName The name of the song to be played
     * @param lyrics The lyrics of the song
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
            LanguageSongs.sleep(); // Delays between lyrics
        }
    }
}