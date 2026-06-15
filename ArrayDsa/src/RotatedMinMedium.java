public class RotatedMinMedium {
    static void main() {
        int [] arr = {5,9,2,3,4};
        int ans = search(arr);
        System.out.println(ans);
    }
   static int search(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while (start<=end){
                int mid = start+(end-start)/2;
                if(mid<end && arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }
                if(mid>start && arr[mid-1]>arr[mid]){
                    return arr[mid];
                }
                if(arr[mid]<=arr[end]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            } return arr[0];
        }
    }
