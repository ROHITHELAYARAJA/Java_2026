import java.util.Arrays;

public class binarysearch {
    static void main() {
        int arr [] = {1,2,4,5,6,7};
        int tar = 7;
        int ans = answer(arr,tar,0,arr.length-1);
        System.out.println(ans);
    }
    static int answer(int[] arr,int tar,int start,int end) {
        if(start>end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == tar) {
            return mid;
        } else if (arr[mid] > tar) {
            return answer(arr, tar, start, mid - 1);
        } else {
            return answer(arr, tar, mid + 1, end);
        }

    }
    }
