public class peak {
    static void main() {
        int arr[] = {1,2,3, 4, 5,6,10,7,3,2,1,-10};
        int ans = pk(arr);
        System.out.println(ans);
    }

    static int pk(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}