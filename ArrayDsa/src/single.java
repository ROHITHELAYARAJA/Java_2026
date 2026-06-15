import java.util.Arrays;

public class single {
    public static void main() {
        int arr[]= {1,1,2,2,3,3,4,4,5,6,6,7,7,8,8};

        int ans = binary(arr);
        System.out.println(ans);
    }
    static int binary(int arr[]){
        int n =  arr.length-1;
        if(n==0){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n]!=arr[n-1]){
            return arr[n];
        }
        int left= 1,right=n-1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return  arr[mid];
            }
            if(mid%2==0 && arr[mid]==arr[mid+1] ||  mid%2==1 && arr[mid-1]==arr[mid]){
                left = mid + 1;
            }
            else{
               right = mid - 1;
            }
        }
        return 0;
    }
}
