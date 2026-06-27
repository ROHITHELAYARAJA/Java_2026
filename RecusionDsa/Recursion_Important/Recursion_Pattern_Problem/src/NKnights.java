public class NKnights {
    static void main() {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, 4);
    }
    private static void knight(boolean[][] board, int row, int col, int Knights) {
        if(Knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(row== board.length-1 && col== board[0].length-1){
            return;
        }
        if(col== board[0].length){
            knight(board, row + 1, 0, Knights);
            return;
        }
        if(Safe(board,row,col)){
            board[row][col]=true;
            knight(board, row , col + 1, Knights-1);
            board[row][col]=false;
        }
        knight(board, row , col+1, Knights);
    }

    private static boolean Safe(boolean[][] board, int row, int col){
        if (Valid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if (Valid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if (Valid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if (Valid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    private static boolean Valid(boolean[][] board, int row, int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }


    static void display(boolean[][] board) {
        for (boolean[] nKnights: board) {
            for (boolean n: nKnights) {
                if(n){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
