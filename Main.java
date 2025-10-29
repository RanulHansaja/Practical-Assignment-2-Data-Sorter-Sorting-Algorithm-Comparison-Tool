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
                // to be added in next commits
            }

        } while (choice != 7);

        scanner.close();
    }
}

