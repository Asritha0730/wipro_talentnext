package task;

public class SortService {
    public int[] sortValues(int[] arr) {
        java.util.Arrays.sort(arr);
        return arr;
    }

    public boolean isValuePresent(int[] arr, int value) {
        for (int v : arr) {
            if (v == value) return true;
        }
        return false;
    }
}
