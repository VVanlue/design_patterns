import java.util.ArrayList;

/**
 * Displays the percentage of votes for each candidate based on their weighted votes and Implements the Observer interface
 * @author Victoria
 */
public class PercentageDisplay implements Observer {
    private ArrayList<Candidate> candidates;

    /**
     * Constructs a PercentageDisplay with a given poll(Subject) and registers the observer to be notified when the poll changes
     * @param poll The poll to which this observer is registered
     */
    public PercentageDisplay(Subject poll) {
        poll.registerObserver(this);
    }

    /**
     * Updates the list of candidates and display of vote percentages
     * @param candidates The updated list of candidates
     */
    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    /**
     * Displays the percentage of total weighted votes for every candidate
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
