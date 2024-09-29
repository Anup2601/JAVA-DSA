
import java.util.Scanner;

class subarray{
    public static void main(String[] args) {
        int arr[]=new int[10];
        int total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a array");
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("subarray are ");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+",");
                }
                total++;
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("total = "+total);
    }
}