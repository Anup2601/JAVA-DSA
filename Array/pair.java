
import java.util.Scanner;

class pair{
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Pairs of array");
        for (int i = 0; i < 5; i++) {
            int curr=arr[i];
            for (int j = i+1; j < 5; j++) {
                System.out.print(" (" + curr + "," + arr[j]+") ");
            }
            System.out.println(" ");
        }
    }
}