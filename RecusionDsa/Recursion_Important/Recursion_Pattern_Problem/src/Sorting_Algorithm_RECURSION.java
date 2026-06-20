import java.util.Arrays;

public class Sorting_Algorithm_RECURSION {
   public static void main(String[] args) {
        int [] arr = {1,4,5,2,3};
        bubbleSort(arr, arr.length-1,0 );
        System.out.println(Arrays.toString(arr));

    }
    static void bubbleSort(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                swap(arr, col, col + 1);
            }
            bubbleSort(arr, row, col + 1);
        } else {
            bubbleSort(arr, row - 1, 0);
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
