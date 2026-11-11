import java.util.Scanner;

/**
 * Task 2: Count even and odd numbers.
 * Reads integers until 0 is entered. 0 is not counted.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.println("Enter integers (0 to finish):");
        while (in.hasNextInt()) {
            int x = in.nextInt();
            if (x == 0) {
                break;
            }
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
