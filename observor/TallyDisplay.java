import java.util.ArrayList;

public class TallyDisplay implements Observer {
    private Subject poll;
    private ArrayList<Candidate> candidates;

    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    @Override
    public void update(ArrayList<Candidate> candidates) {
        this.candidates = candidates;
        display();
    }

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
