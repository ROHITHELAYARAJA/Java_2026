import java.util.Arrays;

public class Sorting_Algorithm_RECURSION {
    static void main() {
        int [] arr = {1,4,5,2,3};
        bubble_SORT(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        bubble_SORT2(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_SORT(int[] arr,int start ,int end) {
        if(start==0){
            return ;
        }
        if(arr[start]>arr[end]){
            swap(arr,start,end);
            bubble_SORT(arr,start-1,end);
        }
        else{
            bubble_SORT(arr,start-1,end);
        }
    }

    static void bubble_SORT2(int[] arr,int start ,int end) {
        if(start==0){
            return ;
        }
        if(arr[start]<arr[end]){
            swap(arr,start,end);
            bubble_SORT2(arr,start-1,end);
        }
        else{
            bubble_SORT2(arr,start-1,end);
        }
    }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
