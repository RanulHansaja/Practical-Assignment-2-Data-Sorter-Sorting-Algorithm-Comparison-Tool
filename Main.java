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
