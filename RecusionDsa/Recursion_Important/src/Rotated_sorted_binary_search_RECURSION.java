public class Rotated_sorted_binary_search_RECURSION {
    static void main() {
        int [] arr = {1,2,3,4,0,-1,-2};
        int tar = -1;
        System.out.println(RBS(arr,tar,0,arr.length-1));

    }
    static  int RBS(int [] arr,int tar,int start,int end) {
        if(start>end) {
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==tar) {
            return mid;
        }
        if(arr[start]<=arr[mid]) {
            if(tar>=arr[start] && tar<=arr[mid]) {
              return   RBS(arr,tar,start,mid-1);
            }
            else {
               return  RBS(arr,tar,mid+1,end);
            }
        }
        if(tar>=arr[mid] && tar<=arr[end]) {
            return  RBS(arr,tar,mid+1,end);
        }
        return RBS(arr,tar,start,mid-1);
    }
}
