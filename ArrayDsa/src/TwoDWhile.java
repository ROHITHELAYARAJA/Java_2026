import java.util.Arrays;

public class TwoDWhile {
    static void main() {
        int[][] arr ={ {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
        };
        answer7(arr);





    }

    static void answer1(int[][] arr) { // primary matrix from top to bottom
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            System.out.print(arr[rowStart][colStart] + " ");
            rowStart++;
            colStart++;
            System.out.println();
        }

    }

    static void answer2(int[][] arr) { // normal 2D matrix
        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int colStart = 0;
        int colEnd = arr[0].length - 1;
        while (rowStart <= rowEnd) {
            while (colStart <= colEnd) {
                System.out.print(arr[rowStart][colStart] + " ");
                colStart++;
            }
            rowStart++;
            colStart = 0;
            System.out.println();
        }
    }

    static void answer3(int[][] arr) {
        int rowEnd = 0;
        int rowStart = arr.length - 1;
        int colEnd = 0;
        int colStart = arr[0].length - 1;
        while (rowEnd <= rowStart) {
            while (colEnd <= colStart) {
                System.out.print(arr[rowEnd][colEnd] + " ");
                colStart--;
            }
            rowStart--;
            colStart = arr[0].length - 1;
            System.out.println();
        }
    }

    static void answer4(int[][] arr) {// primary matrix top to bottom
        int rowStart = arr.length - 1;
        int rowEnd = 0;
        int colStart = arr.length - 1;
        int colEnd = 0;
        while (rowStart >= rowEnd && colStart >= colEnd) {
            System.out.println(arr[rowStart][colStart] + " ");
            rowStart--;
            colStart--;
        }
    }
    static void answer5(int[][] arr) {  // secondary matrix boottom to top
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i][j] + " ");
            j++;
        }
    }

    static void answer6(int[][] arr) {  // secondary matrix top to bottom
        int j= arr.length-1;
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i][j] + " ");
            j--;
        }
    }

    static void answer7(int[][] arr) {
        int [] ans = new int[arr.length];
        int n = arr.length;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j=0;j<arr[i].length;j++){
                sum =  sum + arr[i][j];
            }
            ans[i] = sum;
            answer = maxi(ans,n);
        }

        System.out.println(Arrays.toString(ans) + " "+ answer);

    }



    static int maxi(int [] arr,int len){
        int max = Integer.MIN_VALUE;
        if (len==0){
            return max;
        }
        if(arr[len-1]>max){
            max = arr[len-1];
        }
        maxi(arr,len-1);
        return max;
        }

    }
