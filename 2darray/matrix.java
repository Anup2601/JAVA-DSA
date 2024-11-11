
import java.util.Scanner;

class matrix{
    public static void max(int arr[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The max value of matrix is:-"+max);
        System.out.println("The min value of matrix is:-"+min);
    }
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("the input matrix is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        max(arr);
    }
}