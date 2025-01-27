import java.util.ArrayList;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    public StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<>();
        candidates = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    public void addCandidate(String fullName) {
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 2) {
            candidates.add(new Candidate(nameParts[0], nameParts[1]));
        } else {
            throw new IllegalArgumentException("Full name must include exactly two parts.");
        }
        notifyObservers();

    }

    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
        notifyObservers();
    }

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

    public String getSchool() {
        return school;
    }
}
