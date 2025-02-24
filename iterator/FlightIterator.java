import java.util.Iterator;
import java.util.ArrayList;

/**
 * Iterator for traversing a list of flights
 * @author Victoria
 */
class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructs a FlightIterator for filtering flights
     * @param flights The list of flights
     * @param from The origin airport
     * @param to The destination airport
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.sameLoc(from, to)) {
                this.flights.add(flight);
            }
        }
        this.position = 0;
        this.from = from;
        this.to = to;
    }

     /**
     * Checks if there are more flights in the iteration
     * @return True if there is another flight false otherwise
     */
    @Override
    public boolean hasNext() {
        return position < flights.size();
    }

    /**
     * Returns the next flight in the iteration
     * @return The next Flight object
     */
    @Override
    public Flight next() {
        return flights.get(position++);
    }
}
