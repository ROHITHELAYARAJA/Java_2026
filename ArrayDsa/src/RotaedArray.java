import java.util.Arrays;

public class RotaedArray {
    static void main() {
        int [] arr = {1,2,3,4,5};
        int rotate  = 2;
        int ans [] = Rotate(arr,rotate);
        System.out.println(Arrays.toString(arr));
    }
    static int []Rotate(int[] arr,int rotate){
        int len = arr.length;
        int k = rotate%len;
        reverse(arr,0,len-1); // {5,4,3,2,1}
        reverse(arr,0,k-1);  // {4,5,3,2,1}
        reverse(arr,k,len-1);     // {4,5,1,2,3}
        return arr;
    }
    static int [] reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
    } return arr;
    }
}
