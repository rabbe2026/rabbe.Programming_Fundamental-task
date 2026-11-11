import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Task 4: Count numbers smaller than their left neighbor.
 * Reads all integers from duomenys.txt.
 * Spec says the first number is n (the count), but Example 1 has no n line,
 * so: if the first number equals (total numbers - 1) it is treated as n and
 * skipped; otherwise all numbers are treated as data.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        try (Scanner in = new Scanner(new File("duomenys.txt"))) {
            while (in.hasNextInt()) {
                nums.add(in.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: duomenys.txt");
            return;
        }

        int start = 0;
        if (!nums.isEmpty() && nums.get(0) == nums.size() - 1) {
            start = 1; // first value is n
        }

        int count = 0;
        for (int i = start + 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
