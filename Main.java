import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DataSorterApp app = new DataSorterApp();
        app.run();
    }
}

class DataSorterApp {
    public void run() {
        Utils.ScannerWrapper scanner = new Utils.ScannerWrapper();
        int[] data = new int[0];
        int choice;
        do {
            Utils.printMenu();
            choice = Utils.getIntInput(scanner, "Enter your choice: ");
            switch (choice) {
                case 1 -> {
                    data = Utils.getManualInput(scanner);
                }
                case 2 -> {
                    data = Utils.generateRandomList(scanner);
                    System.out.println("Generated data: " + Arrays.toString(data));
                }
                case 3 -> {
                    if (data.length == 0) {
                        System.out.println("⚠ Please enter or generate data first!");
                    } else {
                        Utils.SortResult res = BubbleSort.sort(data);
                        System.out.println("Sorted (Bubble Sort): " + Arrays.toString(res.sorted));
                        System.out.printf("Time: %.3f ms | Steps: %d%n", res.timeMs, res.steps);
                    }
                }
                case 4 -> {
                    if (data.length == 0) {
                        System.out.println("⚠ Please enter or generate data first!");
                    } else {
                        Utils.SortResult res = MergeSort.sort(data);
                        System.out.println("Sorted (Merge Sort): " + Arrays.toString(res.sorted));
                        System.out.printf("Time: %.3f ms | Steps: %d%n", res.timeMs, res.steps);
                    }
                }
                case 5 -> {
                    if (data.length == 0) {
                        System.out.println("⚠ Please enter or generate data first!");
                    } else {
                        Utils.SortResult res = QuickSort.sort(data);
                        System.out.println("Sorted (Quick Sort): " + Arrays.toString(res.sorted));
                        System.out.printf("Time: %.3f ms | Steps: %d%n", res.timeMs, res.steps);
                    }
                }
                case 6 -> {
                    if (data.length == 0) {
                        System.out.println("⚠ Please enter or generate data first!");
                    } else {
                        compareAll(data);
                    }
                }
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 7);
        scanner.close();
    }

