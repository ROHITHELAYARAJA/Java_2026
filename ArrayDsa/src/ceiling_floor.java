public class ceiling_floor {
    static void main() {      int [] x = {1,2,34,55,58,66,78,99};
        int y = 77;
        System.out.println(ceil(x,y));
        System.out.println(floor(x,y));
    }
    static int ceil(int [] arr, int target){
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
        }return  arr[start];
    }
    static int floor(int [] arr, int target){
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
        }return  arr[end];
    }

}
