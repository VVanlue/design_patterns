import java.util.ArrayList;

/**
 * Displays the tally of votes for each candidate and notifies observer
 * @author Victoria
 */
public class TallyDisplay implements Observer {
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a TallyDisplay for a given poll and notifies observer
     * @param poll The poll for the registered observer
     */
    public TallyDisplay(Subject poll) {
        poll.registerObserver(this);
    }

    /**
     * Updates the list of candidates and display of vote tallies
     * @param candidates The updated list of candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current tally amount for each candidate
     */
    private void display() {
        System.out.println("\nCurrent Tallies:");
        for (Candidate candidate : candidates) {
            System.out.printf("%s: First(%d), Second(%d), Third(%d)\n",
                    candidate.getFullName(),
                    candidate.getNumFirstPlaceVotes(),
                    candidate.getNumSecondPlaceVotes(),
                    candidate.getNumThirdPlaceVotes());
        }
    }
}
