import java.util.*;
public class MergeSort {
   public static void main(String[] args) {
        int arr [] = {1,4,5,2,3,9,7};
//        int ans [] = merge_sort(arr);
//        System.out.println(Arrays.toString(ans));
       merge_sortInplace(arr,0,arr.length-1);
       System.out.println(Arrays.toString(arr));
    }
    static int[] merge_sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = merge_sort( Arrays.copyOfRange(arr,0,mid));
        int right[] = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int [] merged = new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                merged[k++]=left[i++];
            }
            else{
                merged[k++] = right[j++];
            }
        }
        while(i<left.length){
            merged[k++] = left[i++];
        }
        while (j<right.length){
            merged[k++] = right[j++];
        }
        return merged;
    }
    static void merge_sortInplace(int[] arr,int s , int e){
        if(s>=e){
            return;
        }
        int mid = s+(e-s)/2;
        merge_sortInplace(arr,s,mid);
        merge_sortInplace(arr,mid+1,e);
        mergeInplace(arr,s,mid,e);

    }
    static void mergeInplace(int [] arr,int s,int mid,int e){
        int [] merged = new int[e-s+1];
        int i=s;
        int j=mid+1;
        int k=0;
        while(i<=mid&& j<=e){
            if(arr[i] <=arr[j]){
                merged[k++]=arr[i++];
            }
            else{
                merged[k++] = arr[j++];
            }
        }
        while(i<=mid){
            merged[k++] = arr[i++];
        }
        while (j<=e){
            merged[k++] = arr[j++];
        }
        for (int l = 0; l < merged.length; l++) {
            arr[s+l] = merged[l];
        }

    }
}
