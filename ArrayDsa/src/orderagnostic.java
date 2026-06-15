public class orderagnostic {
    static void main() {
        int [] x = {10,9,8,7,6,5,3,};
        int y = 3;
        System.out.println(orderagnosticBS(x,y));

    }
    static int orderagnosticBS(int []arr,int target){
        int start =0;
        int end  = arr.length-1;
        boolean isassending = arr[start]<arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(isassending) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            else{
                if (target <arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }

        }return  -1;
    }
}
