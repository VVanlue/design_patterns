import java.util.ArrayList;

/**
 * Displays the percentage of votes for each candidate based on weighted votes.
 * Implements the Observer interface to be notified when the list of candidates is updated.
 * @author Victoria
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a PercentageDisplay with a given poll (Subject).
     * Registers this observer to be notified when the poll changes.
     * @param poll The poll (Subject) to which this observer is registered.
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the list of candidates and triggers the display of vote percentages.
     * @param candidates The updated list of candidates.
     */
    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the current percentage of total weighted votes for each candidate.
     */
    private void display() {
        System.out.println("\nCurrent Percent of Votes:");
        double totalWeightedVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        for (Candidate candidate : candidates) {
            double percentage = (candidate.getWeightedVotes() / totalWeightedVotes) * 100;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
    }
}
