import java.util.*;
public class twoD0binary {
    static void main() {
    int [] [] matrix = {
            {1,2,3}, // 0
            {4,5,6},  // 1
            {7,8,9}};  // 2
    int tar = 6;
    int ans [] = twoDsearch(matrix,tar);
        System.out.println(Arrays.toString(ans));
    }
    static int []twoDsearch(int [][] arr,int tar){
        for(int row=0;row<arr.length;row++) {
        for(int column=0;column<arr[row].length;column++){
            if(arr[row][column]==tar){
                return new int[]{row,column};
            }
        }
        } return new int []{-1,-1};
    }
}
