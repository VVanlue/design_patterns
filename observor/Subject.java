/**
 * Subject maintains the list of observers and notifies them of any changes
 * @author Victoria
 */
public interface Subject {

    /**
     * Registers an observer to be notified of updates
     * @param observer 
     */
    void registerObserver(Observer observer);

    /**
     * Removes an observer from the list of observers
     * @param observer 
     */
    void removeObserver(Observer observer);

    /**
     * Notifies all registered observers about changes made
     */
    void notifyObservers();
}
