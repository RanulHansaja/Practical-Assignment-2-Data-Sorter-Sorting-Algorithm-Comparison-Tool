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
