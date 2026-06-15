public class spiralmatrix {
    static void main() {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        spiral(arr);

    }
    static void spiral(int[][] arr){
        int RowStart = 0;
        int RowEnd = arr.length-1;
        int ColStart = 0;
        int ColEnd = arr[0].length-1;
        while (RowStart<=RowEnd && ColStart<=ColEnd){
            for (int i = ColStart; i <= ColEnd ; i++) {
                System.out.print(arr[RowStart][i] +" ");
            }
            RowStart++;
            for (int i = RowStart; i <=RowEnd ; i++) {
                System.out.print(arr[i][ColEnd] +" ");
            }
            ColEnd--;
            for(int i=ColEnd;i>=ColStart;i--){
                System.out.print(arr[RowEnd][i] +" ");
            }
            RowEnd--;
            for (int i = RowEnd; i >= RowStart; i--) {
                System.out.print(arr[i][ColStart] +" ");
            }
            ColStart++;
        }

    }
}
