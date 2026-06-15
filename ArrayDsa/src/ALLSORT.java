import java.util.*;
public class ALLSORT {
    public static void main(String[] args) {
        int arr[] = {1,9,4,5,6,3,2,8,7,10,0};
//        cycle(arr);
//        System.out.println(Arrays.toString(arr));
//        int [] arr2 = {1,4,2,5,3};
//        selectsort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        bublesort(arr);
//        System.out.println(Arrays.toString(arr));
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length-i-1;
            int maximum = maxiorselection(arr,0,last);
            swap(arr,maximum,last);
        }
    }
    static void insertionsort(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }

        }
    }

    static int maxiorselection(int[] arr ,int start,int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = i;
            }
        }
        return max;
    }

    static void cycle(int [] arr){
        int n = arr.length; // {3,4,5,1} 8
        int i = 0;
        while (i<n){
            int current_index = arr[i];
            if(arr[i] < n && arr[i]!=arr[current_index]){
                swap(arr,i,current_index);
            }else {
                i++;
            }
        }
    }

    static int[] swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return arr;
    }

    static void bublesort(int [] arr){
        //time complexity for buble sort is in the worst case is o(n*n) if in best case that is achieved by using boolean for checking is o(n)
        for(int i=0;i<arr.length;i++){
            boolean is_swap = false;
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    is_swap = true;
                }
            }
            if(!is_swap){
                break;
            }
        }
    }
}
