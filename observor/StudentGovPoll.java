import java.util.ArrayList;

/**
 * Represents a student government poll that maintains a list of candidates and updates observers when changes occur
 * @author Victoria
 */
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    /**
     * Constructs a StudentGovPoll for a given school and initializes the list of observers and candidates
     * @param school The name of the school hosting  the poll
     */
    public StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<>();
        candidates = new ArrayList<>();
    }

    /**
     * Registers an observer to be notified of updates
     * @param observer The registered observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list of observers
     * @param observer The removed observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies registered observers with the updated list of candidates
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    /**
     * Adds a candidate to the poll using their full name and splits the full name into first and last names
     * @param fullName The full name of the candidate
     * @throws IllegalArgumentException if the full name doesn't have exactly two parts
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
     * Adds a candidate to the poll using their first and last name
     * @param firstName 
     * @param lastName 
     */
    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
        notifyObservers();
    }

    /**
     * Enters votes for candidates in first, second, and third place and updates the corresponding candidate's vote count
     * @param firstPlace 
     * @param secondPlace 
     * @param thirdPlace 
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
     * Returns the name of the school hossting  the poll
     * @return The school name
     */
    public String getSchool() {
        return school;
    }
}
