public class binary {
    static void main() {
        int [] x = {1,2,34,55,58,66,78,99};
        int y = 99;
        System.out.println(binarysearch(x,y));

    }
    static int binarysearch(int [] arr, int target){
        int start =0;
        int end  = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }return  -1;
    }
}
