import java.util.Scanner;

/**
 * Task 1: Laptop savings.
 * Finds the number of weeks k such that s + k * m >= p.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("p (laptop price): ");
        int p = in.nextInt();
        System.out.print("s (already saved): ");
        int s = in.nextInt();
        System.out.print("m (saved per week): ");
        int m = in.nextInt();

        int k = 0;
        int savings = s;

        if (savings < p && m <= 0) {
            System.out.println("The student can never afford the laptop (m must be > 0).");
            return;
        }

        while (savings < p) {
            savings += m;
            k++;
        }

        System.out.println("k = " + k);
    }
}
