import java.util.Scanner;
import java.util.Random;
/*
Menu provides two options for the user and one exit
First menu option outputs a random roll of 2 six-sided dice.
Second menu option rolls n (given by user input) two-sided dice and then displays the amount of head or tails
 */
public class DiceMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\n--- Dice Menu ---");
            System.out.println("1. Roll two 6-sided dice");
            System.out.println("2. Flip N 2-sided dice");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Roll two 6-sided dice
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                System.out.println("You rolled: " + die1 + " and " + die2);
            } else if (choice == 2) {
                // Flip N 2-sided dice
                System.out.print("Enter the number of 2-sided dice to flip: ");
                int n = scanner.nextInt();

                int headsCount = 0;
                int tailsCount = 0;

                System.out.println("Flipping " + n + " dice:");
                for (int i = 1; i <= n; i++) {
                    boolean isHeads = random.nextInt(2) == 0;
                    if (isHeads) {
                        System.out.println("Die " + i + ": Heads");
                        headsCount++;
                    } else {
                        System.out.println("Die " + i + ": Tails");
                        tailsCount++;
                    }
                }

                System.out.println("Total Heads: " + headsCount);
                System.out.println("Total Tails: " + tailsCount);

            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}


