import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    // Recursive method to perform selection sort on a list using a comparator
    public static <T> void selectionSortRecursive(ArrayList<T> list, Comparator<? super T> comparator, int start) {
        // Base case: if starting index is at the end of the list, return
        if (start >= list.size() - 1) {
            return;
        }

        // Find the minimum element in the unsorted part of the list
        int minIndex = start;
        for (int i = start + 1; i < list.size(); i++) {
            if (comparator.compare(list.get(i), list.get(minIndex)) < 0) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the first element of the unsorted part
        T temp = list.get(minIndex); // Temporarily store the element at minIndex
        list.set(minIndex, list.get(start)); // Place the element at start into minIndex
        list.set(start, temp); // Place the temporarily stored element into start

        // Recursively call the function to sort the remaining list
        selectionSortRecursive(list, comparator, start + 1);
    }
}
