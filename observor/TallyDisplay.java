import java.util.ArrayList;

/**
 * Displays the tally of votes for each candidate, showing the number of first, second, and third place votes.
 * Implements the Observer interface to be notified when the list of candidates is updated.
 * @author Victoria
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a TallyDisplay for a given poll (Subject).
     * Registers this observer to be notified when the poll changes.
     * @param poll The poll (Subject) to which this observer is registered.
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the list of candidates and triggers the display of vote tallies.
     * @param candidates The updated list of candidates.
     */
    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current tallies for each candidate, including first, second, and third place votes.
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
