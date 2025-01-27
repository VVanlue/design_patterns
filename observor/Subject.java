/**
 * Represents a Subject in the Observer design pattern.
 * A Subject maintains a list of observers and notifies them of any changes.
 * @author Victoria
 */
public interface Subject {

    /**
     * Registers an observer to be notified of updates.
     * @param observer The observer to be registered.
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of observers.
     * @param observer The observer to be removed.
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers about changes.
     */
    void notifyObservers();
}
