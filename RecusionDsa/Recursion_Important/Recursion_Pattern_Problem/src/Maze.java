import java.util.ArrayList;

public class Maze {
    static void main() {
//        System.out.println(mazepath( 3, 3));
//        maze("",3,3);
//        mazediagonal("",3,3);
//        System.out.println(mazeRet("",3,3));
        boolean [] [] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeRestriction("",board,0,0);
    }
    static int mazepath(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left =  mazepath(r-1,c);
        int right = mazepath(r,c-1);
        return left+right;
    }

    static void maze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            maze(p+"D",r-1,c);
        }
        if(c>1){
            maze(p+"R",r,c-1);
        }
    }


    static void mazediagonal(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1 && c>1){
            mazediagonal(p+"D",r-1,c-1);
        }
        if(r>1){
            mazediagonal(p+"V",r-1,c);
        }
        if(c>1){
            mazediagonal(p+"H",r,c-1);
        }
    }



    static ArrayList<String> mazeRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(mazeRet(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(mazeRet(p+"R",r,c-1));
        }
        return list;
    }

    static void mazeRestriction(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;

        }
        if(r<maze.length-1){
            mazeRestriction(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            mazeRestriction(p+"R",maze,r,c+1);
        }
    }




}
