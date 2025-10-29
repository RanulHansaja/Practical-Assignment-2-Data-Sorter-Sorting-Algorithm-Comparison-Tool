import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Utils {

    // Simple wrapper for scanner so we can close it once in main
    public static class ScannerWrapper {
        private Scanner scanner = new Scanner(System.in);
        public String nextLine() { return scanner.nextLine(); }
        public void close() { scanner.close(); }
    }

    public static class SortResult {
        public final int[] sorted;
        public final double timeMs;
        public final long steps;
        public SortResult(int[] sorted, double timeMs, long steps) {
            this.sorted = sorted;
            this.timeMs = timeMs;
            this.steps = steps;
        }
    }

    public static void printMenu() {
        System.out.println("\n--- Data Sorter: Sorting Algorithm Comparison Tool ---");
        System.out.println("1. Enter numbers manually");
        System.out.println("2. Generate random numbers");
        System.out.println("3. Perform Bubble Sort");
        System.out.println("4. Perform Merge Sort");
        System.out.println("5. Perform Quick Sort");
        System.out.println("6. Compare all algorithms (show performance table)");
        System.out.println("7. Exit");
    }