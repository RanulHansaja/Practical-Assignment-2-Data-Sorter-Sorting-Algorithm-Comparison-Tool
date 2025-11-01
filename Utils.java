import java.util.Random;
import java.util.Scanner;

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

    public static int getIntInput(ScannerWrapper scanner, String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                return Integer.parseInt(line);
            } catch (Exception e) {
                System.out.print("Please enter a valid integer: ");
            }
        }
    }
    
    public static int[] getManualInput(ScannerWrapper scanner) {
        System.out.print("Enter numbers separated by spaces: ");
        while (true) {
            try {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) return new int[0];
                String[] parts = line.split("\\s+");
                int[] arr = new int[parts.length];
                for (int i = 0; i < parts.length; i++) arr[i] = Integer.parseInt(parts[i]);
                System.out.println("✅ Data successfully stored.");
                return arr;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter integers only: ");
            }
        }
    }

    public static int[] generateRandomList(ScannerWrapper scanner) {
        int n = getIntInput(scanner, "Enter number of elements to generate: ");
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = rand.nextInt(1000);
        System.out.println("✅ Random dataset generated.");
        return arr;
    }
}
