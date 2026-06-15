import java.util.Arrays;

public class DuplicateNubmerCycle {
     public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2}; // 12342
        int ans = cycle1(arr);
        System.out.println(ans);
    }

    static int cycle1(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if(arr[i]!=i+1){
                int x = arr[i] - 1;

                if (arr[i] != arr[x]) {
                    swap(arr, i, x);
                } else {
                    return  arr[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
