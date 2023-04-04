import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(term)) {
                return i;
            }
        }
        return -1;
    }

    public static int orderedSearch(ArrayList<String> items, String term) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(term)) {
                return i;
            }
            if (items.get(i).compareTo(term) > 0) {
                return -1;
            }
        }
        return -1;
    }

    public static int orderedBinarySearch(ArrayList<String> items, String term) {
        int low = 0;
        int high = items.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (items.get(mid).equals(term)) {
                return mid;
            }
            if (items.get(mid).compareTo(term) > 0) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        
    }
}