import java.util.Arrays;

public class Sorting_Algorithm_RECURSION_2 {
   public static void main(String[] args) {
        int [] arr = {1,4,5,2,3};
        selection_sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void selection_sort(int [] arr,int row){
       if (row==0){
           return;
       }
       int maxiPosition = maximum(arr,0,row,0);
       swap(arr,row,maxiPosition);
       selection_sort(arr,row-1);


    }
    static int maximum(int [] arr,int start,int end,int index){
       if (start>end){
           return index;
       }
       if(arr[start]>arr[index]){
           index=start;
       }
       return maximum(arr,start+1,end,index);
   }
    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
