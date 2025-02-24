import java.time.LocalTime;
import java.time.Duration;

/**
 * Represents a flight with relevant details
 * @author Victoria
 */
public class Flight {
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructs a Flight with the specified details
     * @param flightNum The flight number
     * @param from The origin airport
     * @param to The destination airport
     * @param startTime The departure time
     * @param endTime The arrival time
     * @param numTransfers The number of transfers
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime, int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    /**
     * Gets the origin airport
     * @return The departure airport
     */
    public Airport getFrom() {
        return from;
    }

    /**
     * Gets the destination airport
     * @return The arrival airport
     */
    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight has the specified origin and destination
     * @param from The origin airport
     * @param to The destination airport
     * @return True if the flight matches false otherwise
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a string representation of the flight
     * @return A formatted string with flight details
     */
    @Override
    public String toString() {
        Duration duration = Duration.between(startTime, endTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        String transferInfo = (numTransfers == 0) ? "Direct Flight" : (numTransfers == 1) ? "1 Stopover" : numTransfers + " Transfers";
        return String.format("  %s to %s %s - %s (%dh %dm) %s", from, to, startTime, endTime, hours, minutes, transferInfo);
    }
}
