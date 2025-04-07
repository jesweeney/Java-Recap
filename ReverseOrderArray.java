import java.util.Scanner;
/*
@author Jessica Sweeney
The following program gathers input from user to form an array
Once the correct response is given the program will reverse the order of the elements in the array
Program is complete without making a new array
 */
public class ReverseOrderArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Create array
        int[] arr = new int[size];

        // Get array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Reverse the array in place
        for (int i = 0; i < size / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }

        // Print reversed array
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

