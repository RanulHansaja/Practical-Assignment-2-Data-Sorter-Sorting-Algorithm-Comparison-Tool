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
