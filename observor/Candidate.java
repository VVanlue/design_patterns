/**
 * A candidate in an election with votes for three places
 * @author Victoria
 */
public class Candidate {
    private String firstName;
    private String lastName;
    private int numFirstPlaceVotes = 0;
    private int numSecondPlaceVotes = 0;
    private int numThirdPlaceVotes = 0;

    /**
     * Initializes candidate's first and last name
     * @param firstName Candidate's first name
     * @param lastName Candidate's last name
     */
    public Candidate(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Compares  candidate with another candidate based on  first and last names.
     * @param firstName 
     * @param lastName 
     * @return True if the first name and last name are the same
     */
    public boolean equals(String firstName, String lastName) {
        return this.firstName.equals(firstName) && this.lastName.equals(lastName);
    }

    /**
     * Adds to the number of first place votes for a candidate
     */
    public void addFirstPlaceVote() {
        numFirstPlaceVotes++;
    }

    public void addSecondPlaceVote() {
        numSecondPlaceVotes++;
    }

    
    public void addThirdPlaceVote() {
        numThirdPlaceVotes++;
    }

    /**
     * Calculates the weighted votes for this candidate based on the votes for first, second, and third place
     * @return The weighted votes
     */
    public double getWeightedVotes() {
        return (numFirstPlaceVotes * 0.6) + (numSecondPlaceVotes * 0.3) + (numThirdPlaceVotes * 0.1);
    }

    /**
     * Returns the full name of the candidate
     * @return The full name in the format "firstName lastName"
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the number of first place votes the candidate has received
     * @return The number of first place votes
     */
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
