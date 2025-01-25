public class Candidate {
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes = 0;
    private int numSecondPlaceVotes = 0;
    private int numThirdPlaceVotes = 0;

    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(String firstName, String lastName) {
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);
    }

    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
    }

    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
    }

    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
    }

    public double getWeightedVotes() {
        return (numFirstPlaceVotes * 0.6) + (numSecondPlaceVotes * 0.3) + (numThirdPlaceVotes * 0.1);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getNumFirstPlaceVotes() {
        return numFirstPlaceVotes;
    }

    public int getNumSecondPlaceVotes() {
        return numSecondPlaceVotes;
    }

    public int getNumThirdPlaceVotes() {
        return numThirdPlaceVotes;
    }
}
