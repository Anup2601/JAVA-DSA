
import java.util.Scanner;

class spiral_metrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix=new int[3][3];
        System.out.println("Enter the matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the sprial matris is :-");
        int start_row=0;
        int start_col=0;
        int end_row=matrix.length-1;
        int end_col=matrix.length-1;
        while(start_row<=end_row &&start_col<=end_col ){
            // top  
            for(int j=start_col;j<=end_col;j++){
                System.out.print(matrix[start_col][j]+" ");
            }
            // right 
            for(int i=start_row+1;i<=end_row;i++){

                System.out.print(matrix[i][end_row]+" ");
            }
            // bottom 
            for(int i=end_col-1;i>=start_col;i--){
                if(start_row==end_row){
                    break;
                }
                System.out.print(matrix[end_col][i]+" ");
            }
            //left
            
            for(int i=end_row-1;i>=start_row+1;i--){
                if(start_col==end_col){
                    break;
                }
                System.out.print(matrix[i][start_row]+" ");
            }
            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
        
    }
}