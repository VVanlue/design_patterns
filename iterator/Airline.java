import java.util.ArrayList;

/**
 * Represents an airline with a list of flights
 * @author Victoria
 */
class Airline {
    private String title;
    private ArrayList<Flight> flights;
    /**
     * Constructs an Airline with the given title
     * @param title The name of the airline
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }
    /**
     * Gets the title of the airline
     * @return The airline title
     */
    public String getTitle() {
        return title;
    }
    /**
     * Creates an iterator to filter flights based on origin and destination codes
     * @param fromCode The origin airport code
     * @param toCode The destination airport code
     * @return A FlightIterator for the matching flights
     */
    public FlightIterator createIterator(String fromCode, String toCode) {
        Airport from, to;
        try {
            from = Airport.valueOf(fromCode.toUpperCase());
            to = Airport.valueOf(toCode.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
        return new FlightIterator(flights, from, to);
    }
}

