import org.jcp.xml.dsig.internal.dom.Utils;

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
    rivate static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
