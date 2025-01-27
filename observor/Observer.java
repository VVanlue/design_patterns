import java.util.ArrayList;

/**
 * Represents an Observer, notified when there are changes in the list of candidates
 * @author Victoria
 */
public interface Observer {
    
    /**
     * Updates the observer with the current list of candidates
     * @param candidates The list of candidates to be updated
     */
    void update(ArrayList<Candidate> candidates);
}
