// Brute force

import java.util.Scanner;

class max_subarr {

    public static void main(String[] args) {
        // Array to store elements
        int arr[] = new int[10];

        // To keep track of the total number of subarrays
        int total = 0;

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the array elements
        System.out.println("Enter an array:");

        // Taking input for the first 5 elements of the array
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Print statement to indicate subarrays
        System.out.println("Subarrays are:");

        // Variable to hold the sum of the current subarray
        int sum = 0;

        // Variable to track the maximum subarray sum
        int max = 0;

        // Loop to pick the starting point of the subarray
        for (int i = 0; i < 5; i++) {

            // Loop to pick the ending point of the subarray
            for (int j = i; j < 5; j++) {
                
                // Reset sum for the current subarray
                sum = 0;

                // Loop to calculate the sum of the subarray from arr[i] to arr[j]
                for (int k = i; k <= j; k++) {
                    // Print each element of the current subarray
                    System.out.print(arr[k] + ",");
                    
                    // Add the element to the sum
                    sum += arr[k];
                }

                // Check if the current subarray sum is greater than the max sum found so far
                if (max < sum) {
                    max = sum;  // Update the max sum
                }

                // Print the sum of the current subarray
                System.out.println("  Sum: " + sum);

                // Increment the total number of subarrays
                total++;

                // Add a line break for clarity
                System.out.println(" ");
            }

            // Print an extra line break after each iteration of the outer loop
            System.out.println(" ");
        }

        // Print the total number of subarrays generated
        System.out.println("Total number of subarrays = " + total);

        // Print the maximum subarray sum
        System.out.println("Max subarray sum = " + max);
    }
}
