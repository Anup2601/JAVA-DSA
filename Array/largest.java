
import java.util.Scanner;

class largest{
    public static void main(String[] args) {
        // Declare an array of size 15 to store integers
        int arr[]=new int[15];
        // Create a Scanner object to take input from the user
        Scanner sc=new Scanner(System.in);
        // Prompt the user to enter the elements of the array
        System.out.println("enter a array");
        // Loop to take input for the first 11 elements of the array
        for (int i = 0; i <=10; i++) {
            arr[i]=sc.nextInt();// Storing the input in the array
        }
         // Initialize a variable to store the maximum value, starting with 0
        int max=0;
        // Loop to find the largest element in the array
        for (int j = 0; j <= 10; j++) {
            // Check if the current array element is greater than 'max'
          if(arr[j]>max){
            max=arr[j];// Update 'max' if a larger element is found
          }  
        }
         // Output the largest element found in the array~
        System.out.println("Largest array is "+ max);
    }
}