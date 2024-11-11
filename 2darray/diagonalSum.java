import java.util.*;

class diagonalSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][3] ;
        System.out.println("enter your matrix");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    if(i==j){
                        continue;
                    }
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println("sum of the diagonal is:-"+sum);
    }
}