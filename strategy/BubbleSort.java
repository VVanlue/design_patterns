import java.util.ArrayList;

// Sorts high to low
public class BubbleSort implements SortBehavior {
    @Override
    public ArrayList<Appartment> sort(ArrayList<Appartment> appartments) {
        int n = appartments.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (appartments.get(j).compareTo(appartments.get(j + 1)) > 0) {
                    // Swaps appartments[j] and appartments[j+1]
                    Appartment temp = appartments.get(j);
                    appartments.set(j, appartments.get(j + 1));
                    appartments.set(j + 1, temp);
                }
            }
        }
        return new ArrayList<>(appartments); // Returns back the sorted list
    }
}