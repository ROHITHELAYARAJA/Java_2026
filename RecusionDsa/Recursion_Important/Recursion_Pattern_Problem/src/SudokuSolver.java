public class SudokuSolver {
   public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }
    public static boolean solve(int[][] board) {

        int n = board.length;

        int row  =  -1;
        int col   = -1;

        boolean emptyLeft = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }

        if(emptyLeft==true){
            return true;
        }

        for(int number = 1; number<=9; number++){
            if (Safe(board,row,col,number)){
                board[row][col] = number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    public static boolean Safe(int[][] board, int row, int col, int number){

        for(int i=0;i< board.length;i++){
            if(board[i][col]==number){
                return false;
            }
        }
        for(int i=0;i< board.length;i++){
            if(board[row][i]==number){
                return false;
            }
        }

        int sqrt = (int)Math.sqrt(board.length);
        int startRow = row-row%sqrt;
        int startCol = col-col%sqrt;

        for(int i=startRow;i< startRow+sqrt;i++){
            for(int j=startCol;j< startCol+sqrt;j++){
                if(board[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
