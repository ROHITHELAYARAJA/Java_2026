import java.util.Arrays;

public class twoD1binary {
    static void main() {
        int [] [] matrix = {
                {10,20,30,90}, // 0
                {15,25,35,89},  // 1
                {36,38,39}};  // 2
        int tar = 89;
        int ans [] = binary(matrix,tar);
        System.out.println(Arrays.toString(ans));
    }
    static int [] binary(int [][] arr, int tar){
        int row=0;
        int column = arr[0].length-1;
        while(row< arr.length && column>=0){
            if (arr[row][column]==tar){
                return new int[]{row,column};
            }
            else if(arr[row][column]>tar){
                column--;
            }
            else{
                row++;
            }
        } return new int[]{-1,-1};
    }
}
