import java.util.Arrays;

public class Maze_AllPath {
    static void main() {
        boolean [] [] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        Allpath("",board,0,0);
        int [][] path = new int [board.length][board[0].length];
        AllpathArr("",board,0,0,path,1);

    }

    static void Allpath(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){

            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            Allpath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            Allpath(p+"R",maze,r,c+1);
        }
        if(r>0){
            Allpath(p+"U",maze,r-1,c);
        }
        if(c>0){
            Allpath(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }


    static void AllpathArr(String p,boolean[][] maze,int r,int c,int [][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for (int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            AllpathArr(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            AllpathArr(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            AllpathArr(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            AllpathArr(p+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
