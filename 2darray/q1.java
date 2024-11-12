
import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("enter your arr");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("no of 7's is :-"+count);
        sc.close();
    }
}