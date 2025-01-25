import java.util.ArrayList;

public class PercentageDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

    private void display() {
        System.out.println("\nCurrent Percent of Votes:");
        double totalWeightedVotes = candidates.stream().mapToDouble(Candidate::getWeightedVotes).sum();
        for (Candidate candidate : candidates) {
            double percentage = (candidate.getWeightedVotes() / totalWeightedVotes) * 100;
            System.out.printf("%s %.2f%%\n", candidate.getFullName(), percentage);
        }
    }
}
