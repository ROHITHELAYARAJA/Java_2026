import java.util.Arrays;

public class Sorting_Algorithm_RECURSION_2 {
   public static void main(String[] args) {
        int [] arr = {1,4,5,2,3};
        selection_sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
        selection_sort2(arr,arr.length-1,0,0);
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
    static void selection_sort2(int [] arr,int row,int col,int max){
       if (row==0) {
           return;
       }
       if (col<row){
           if(arr[col]>arr[max]){
               selection_sort2(arr,row,col+1,col);
           }
           else{
               selection_sort2(arr,row,col+1,max);
           }
   }
       else{
          int temp = arr[max];
          arr[max] = arr[row-1];
          arr[row-1] = temp;
       }
       selection_sort2(arr,row-1,0,0);
    }
}
