import java.util.ArrayList;

/**
 * Represents a Student Government poll (Subject) that maintains a list of candidates
 * and notifies registered observers when changes occur (e.g., new candidates or votes).
 * @author Victoria
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * Constructs a StudentGovPoll for a given school.
     * Initializes the list of observers and candidates.
     * @param school The name of the school associated with the poll.
     */
    public StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<>();
        candidates = new ArrayList<>();
    }

    /**
     * Registers an observer to be notified of updates.
     * @param observer The observer to be registered.
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all registered observers with the updated list of candidates.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    /**
     * Adds a candidate to the poll using their full name.
     * Splits the full name into first and last names and creates a new Candidate object.
     * @param fullName The full name of the candidate (first name and last name).
     * @throws IllegalArgumentException if the full name does not contain exactly two parts.
     */
    public void addCandidate(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            candidates.add(new Candidate(nameParts[0], nameParts[1]));
        } else {
            throw new IllegalArgumentException("Full name must include exactly two parts.");
        }
        notifyObservers();
    }

    /**
     * Adds a candidate to the poll using their first and last name separately.
     * @param firstName The first name of the candidate.
     * @param lastName The last name of the candidate.
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
        notifyObservers();
    }

    /**
     * Enters votes for candidates in first, second, and third places.
     * Updates the corresponding candidate's vote count.
     * @param firstPlace The position of the first-place vote.
     * @param secondPlace The position of the second-place vote.
     * @param thirdPlace The position of the third-place vote.
     */
    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        if (firstPlace > 0 && firstPlace <= candidates.size()) {
            candidates.get(firstPlace - 1).addFirstPlaceVote();
        }
        if (secondPlace > 0 && secondPlace <= candidates.size()) {
            candidates.get(secondPlace - 1).addSecondPlaceVote();
        }
        if (thirdPlace > 0 && thirdPlace <= candidates.size()) {
            candidates.get(thirdPlace - 1).addThirdPlaceVote();
        }
        notifyObservers();
    }

    /**
     * Returns the name of the school associated with the poll.
     * @return The name of the school.
     */
    public String getSchool() {
        return school;
    }
}
