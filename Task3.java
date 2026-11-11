import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Task 3: Count days with negative temperature.
 * File format: first line n, then n integers.
 * The task text mentions both data.txt and duomenys.txt, so the program
 * uses data.txt and falls back to duomenys.txt if data.txt does not exist.
 */
public class Task3 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if (!file.exists()) {
            file = new File("duomenys.txt");
        }

        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            int negative = 0;

            for (int i = 0; i < n && in.hasNextInt(); i++) {
                int t = in.nextInt();
                if (t < 0) {
                    negative++;
                }
            }

            if (negative == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println(negative);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
    }
}
