public class MergeSort {
    private static long stepsCounter;

    public static Utils.SortResult sort(int[] input) {
        int[] arr = java.util.Arrays.copyOf(input, input.length);
        stepsCounter = 0;
        long start = System.nanoTime();
        mergeSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        double timeMs = (end - start) / 1e6;
        return new Utils.SortResult(arr, timeMs, stepsCounter);
    }
