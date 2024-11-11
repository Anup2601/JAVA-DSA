import java.util.*;
class staircase{
    public static boolean sort(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println(row+","+col);
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int [][] matrix={{10,20,30,40},
                         {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        System.out.println("Enter the key you want to print");
        int key=sc.nextInt();
        sort(matrix, key);

    }
}