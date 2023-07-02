import java.util.Arrays;
import java.util.Scanner;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the currency denominations
        System.out.print("Enter the currency denominations (space-separated): ");
        String[] denominationsInput = scanner.nextLine().split(" ");
        int[] denominations = new int[denominationsInput.length];
        for (int i = 0; i < denominationsInput.length; i++) {
            denominations[i] = Integer.parseInt(denominationsInput[i]);
        }

        // Read the amount that you want to pay
        System.out.print("Enter the amount you want to pay: ");
        int amount = scanner.nextInt();

        // Sort the currency denominations in descending order
        Arrays.sort(denominations);
        reverseArray(denominations);

        // Initialize the count variable
        int count = 0;

        // Iterate over the currency denominations
        for (int i = 0; i < denominations.length; i++) {
            // Divide the amount by the current denomination
            int quotient = amount / denominations[i];

            // Add the quotient to the count
            count += quotient;

            // Update the amount
            amount -= quotient * denominations[i];

            // Break if the amount becomes 0
            if (amount == 0) {
                break;
            }
        }

        // Print the minimum number of notes used
        System.out.println("Minimum number of notes: " + count);
    }

    // Helper method to reverse the array
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
