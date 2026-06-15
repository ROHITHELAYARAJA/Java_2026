import java.util.Arrays;

public class boundary {
    public static void main(String[] args) {
        int[][] arr ={ {1, 2, 3,4,5,6,7},
                {8,9,10,11,12,13,14},
                {15,16,17,18,19,20,21},
        };

       answer3(arr);
    }
    static void answer(int[][] arr) { // normal 2D matrix
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                System.out.print(arr[rowStart][i] + " ");

            }
            rowStart++;

            for (int i =rowStart; i<=rowEnd; i++) {
                System.out.print(arr[i][colEnd] + " ");
            }
            colEnd--;
            for (int i =colEnd; i>=colStart; i--) {
                System.out.print(arr[rowEnd][i] + " ");
            }
            rowEnd--;
            for (int i =rowEnd; i>=rowStart; i--) {
                System.out.print(arr[i][colStart] + " ");
            }
            colStart++;
        }
    }

    static int[] answer1(int[][] arr) { // normal 2D matrix
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        int rows = arr.length;
        int cols = arr[0].length;

        int[] ans = new int[2*rows + 2*cols - 4];
        int ind = 0;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                ans [ind++] = arr[rowStart][i];
            }
            rowStart++;

            for (int i =rowStart; i<=rowEnd; i++) {
                ans [ind++] = arr[i][colEnd];
            }
            colEnd--;
            for (int i =colEnd; i>=colStart; i--) {
                ans [ind++] = arr[rowEnd][i] ;
            }
            rowEnd--;
            for (int i =rowEnd; i>=rowStart; i--) {
                ans [ind++] = arr[i][colStart];
            }
            colStart++;
            break;
        }
        return ans;
    }

    static  void answer3(int [] [] arr){
        int lenRowEnd = arr.length;
        int lenCoLEnd = arr[0].length;
        int [] []  answer = new int [lenRowEnd] [lenCoLEnd] ;
        int [] ans = answer1(arr);
        int ind = 0;
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i=colStart; i<=colEnd; i++) {
                answer[rowStart][i] =  ans[ind++];
            }
            rowStart++;

            for (int i =rowStart; i<=rowEnd; i++) {
                answer [i][colEnd] = ans[ind++];
            }
            colEnd--;
            for (int i =colEnd; i>=colStart; i--) {
                answer[rowEnd][i] = ans[ind++];
            }
            rowEnd--;
            for (int i =rowEnd; i>=rowStart; i--) {
               answer[i][colStart] = ans [ind++];

            }
            colStart++;
            break;
        }
        for (int i = 0; i < lenRowEnd; i++) {
            for (int j = 0; j < lenCoLEnd; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
    }
}
