import java.util.Scanner;

    public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the transaction array
        System.out.print("Enter the size of the transaction array: ");
        int size = scanner.nextInt();

        // Read the values of the array
        System.out.print("Enter the values of the array: ");
        int[] transactions = new int[size];
        for (int i = 0; i < size; i++) {
            transactions[i] = scanner.nextInt();
        }

        // Read the total number of targets that need to be achieved
        System.out.print("Enter the total number of targets: ");
        int numTargets = scanner.nextInt();

        // Iterate over each target
        for (int t = 0; t < numTargets; t++) {
            // Read the value of the target
            System.out.print("Enter the value of the target: ");
            int target = scanner.nextInt();

            // Initialize the sum variable
            int total = 0;
            int transactionsRequired = 0;

            // Iterate over the transaction array
            for (int i = 0; i < size; i++) {
                // Add the current transaction to the sum
                total += transactions[i];
                transactionsRequired++;

                // Check if the sum is greater than or equal to the target
                if (total >= target) {
                    // Display the number of transactions required to achieve the target
                    System.out.println("Target achieved after " + transactionsRequired + " transaction(s)");
                    break;
                }

                // Check if we have reached the last transaction and the target is not achieved
                if (i == size - 1) {
                    System.out.println("Given target is not achieved");
                }
            }
        }
    }
}
