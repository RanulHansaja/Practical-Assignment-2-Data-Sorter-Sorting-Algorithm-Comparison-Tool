public class BubbleSort {
    public static Utils.SortResult sort(int[] input) {
        int[] arr = java.util.Arrays.copyOf(input, input.length);
        long steps = 0;
        long start = System.nanoTime();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                steps++;
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
