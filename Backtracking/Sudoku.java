class Sudoku{
    public static boolean sudokuSolver(int sudo[][],int row, int col){
        // base condition
        if(row==9){
            return true;
        }
         // Move to next cell
        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        // If cell already contains a value, skip it
        if(sudo[row][col]!=0){
           return  sudokuSolver(sudo, nextRow, nextCol);  
        }
        // Try placing numbers 1-9
        for (int i = 1; i <= 9; i++) {
            if(issafe(sudo, row, col, i)){
                sudo[row][col]=i;// Place the number
                if(sudokuSolver(sudo, nextRow, nextCol)){
                    return true;
                }
                sudo[row][col]=0; // Backtrack
            }
            
        }
        return false;// No valid number found, backtrack
    }
    
    public static boolean  issafe(int sudo[][],int row, int col ,int digit){
        // row 
        for(int j=0;j<=8;j++){
            if(sudo[row][j]==digit){
                return false;
            }
        }
        // col
        for(int i=0; i<9;i++){
            if(sudo[i][col]==digit){
                return false;
            }
        }
        // grid 
        int sc=(col/3)*3;
        int sr=(row/3)*3;
        for(int i=sr;i<sr+3;i++){
            for (int j=sc;j<sc+3;j++){
               if( sudo[i][j]==digit){
                return false;
               }
            }
        }
        return true;
    }

    public static void printSudoku(int sudo[][]){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudo[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudo[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };

        if(sudokuSolver(sudo,0,0)){
            System.out.println("solution Exist");
            printSudoku(sudo);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}