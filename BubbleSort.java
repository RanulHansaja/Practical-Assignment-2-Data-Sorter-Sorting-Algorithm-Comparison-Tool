public class BubbleSort {
    public static Utils.SortResult sort(int[] input) {
        int[] arr = java.util.Arrays.copyOf(input, input.length);
        long steps = 0;
        long start = System.nanoTime();
        int n = arr.length;
