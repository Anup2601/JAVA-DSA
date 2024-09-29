
import java.util.Scanner;

class revers{
     // Method to swap elements and reverse the array
    public static void swap(int arr[]){
        int s=0,e=arr.length-1; 
        int temp;
        for (int i = 0; i <10/2; i++) {
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            // Move start index forward and end index backward
            s++;e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the array ");
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        // Call the swap method to reverse the array
        swap(arr);
        System.out.println("The reverse array ");
        // Display the reversed array
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}