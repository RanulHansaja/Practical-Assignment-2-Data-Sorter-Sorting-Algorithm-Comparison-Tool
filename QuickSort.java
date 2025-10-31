public class QuickSort {
    private static long stepsCounter;

public static Utils.SortResult sort(int[] input) {
    int[] arr = java.util.Arrays.copyOf(input, input.length);
    stepsCounter = 0;
    long start = System.nanoTime();
    quickSort(arr, 0, arr.length - 1);
    long end = System.nanoTime();
    double timeMs = (end - start) / 1e6;
    return new Utils.SortResult(arr, timeMs, stepsCounter);
}
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

