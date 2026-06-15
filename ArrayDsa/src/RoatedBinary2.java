public class RoatedBinary2 {
        public static void main(String[] args) {
            int[] nums = {2, 5, 6, 0, 0, 1, 2};
            int target = 0;
            boolean ans = answer(nums, target);
            System.out.println(ans);
        }
        static int pivot(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                    if (start < end && arr[start] > arr[start + 1]) {
                        return start;
                    }
                    start++;
                    if (end > start && arr[end] < arr[end - 1]) {
                        return end - 1;
                    }
                    end--;
                }
                else if (arr[start] <= arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            return -1;
        }
        static boolean binarysearch(int[] arr, int tar, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == tar) {
                    return true;
                }
                else if (arr[mid] < tar) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            return false;
        }
        static boolean answer(int[] arr, int tar) {
            int n = arr.length - 1;
            int index = pivot(arr);
            if (index == -1) {
                return binarysearch(arr, tar, 0, n);
            }
            else if (tar >= arr[0] && tar <= arr[index]) {
                return binarysearch(arr, tar, 0, index);
            }
            return binarysearch(arr, tar, index + 1, n);
        }
    }