import java.util.ArrayList;

public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    public AppartmentList() {
        appartments = new ArrayList<>();
        sortBehavior = new BubbleSort(); // Sets the default sort behavior
    }

    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Appartment> getSortedList() {
        return sortBehavior.sort(new ArrayList<>(appartments)); // Returns back a sorted copy of the list
    }

    public ArrayList<Appartment> getUnSortedList() {
        return new ArrayList<>(appartments); // Returns back a copy of the original list
    }
}