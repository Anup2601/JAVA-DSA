class NQueen {
    public static boolean  sol(char board[][],int row){
        // base condition 
        if(row==board.length){
            count++;
            printBoad(board);
            return true;
        }
        // colmmn loop  
        for (int j = 0; j <board.length ; j++) {
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(sol(board, row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col){
        // top 
        for(int i=row-1; i>=0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left 
        for(int i=row-1 , j=col-1; i>=0 && j>=0; i-- , j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right 
        for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }

    public static void printBoad(char board[][]){
        System.out.println("-------------chess board ------------------");
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col]+ " ");
            }
            System.out.println();
        }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=5;
        char board [][]=new char[n][n];
        for (int i = 0; i < n ;i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
        }
        if(sol(board,0)){
            System.out.println("Solution is possible");
        }
        else{
            System.out.println("solution is not possible");
        }
        System.out.println("total ways to solve NQueen problem is :-"+count);
    }
}