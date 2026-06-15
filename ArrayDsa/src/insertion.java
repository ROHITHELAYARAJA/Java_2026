import java.util.Arrays;

public class insertion {
    static void main() {
        int arr[] = {1, 2, 3, 4, 7, 8};
        int tar = 7;
        int index = 4;
        int ans[] = del2(arr, tar, index);
        System.out.println(Arrays.toString(ans));
    }

    static int[] INS(int[] arr, int tar, int index) {
        int arr1[] = new int[arr.length + 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i < index) {
                arr1[i] = arr[i];
            } else if (i == index) {
                arr1[i] = tar;
            } else {
                arr1[i] = arr[i - 1];
            }
        }
        return arr1;
    }

    static int[] del(int[] arr, int tar, int index) {
        int arr1[] = new int[arr.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] == tar) {
                continue;
            } else {
                arr1[i] = arr[i];

            }
        }
        return arr1;
    }

    static int[] del2(int[] arr, int tar, int index) {
        int arr1[] = new int[arr.length-1];
        int index1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                continue;
            } else {
                arr1[index1] = arr[i];
                index1++;
            }
        }
        return arr1;
    }
}
