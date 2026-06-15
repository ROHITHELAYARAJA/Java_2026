public class RotatedBinaryWithDuplicates {
    static void main() {
        int arr [] = {4,4,4,4,5,5,6,7,0,1,2,2,3};
        int tar = 0;
        int answer = search (arr,tar);
        System.out.println(answer);

    }
    static int search(int []arr,int tar){
        int pivot = findpivot(arr);
        System.out.println("pivot is" +  pivot);
        if(pivot==-1){
            return binarysearch(arr,tar,0,arr.length-1);
        }
        if(arr[pivot]==tar){
            return  pivot;
        }
        if(tar>=arr[0]){
            return binarysearch(arr,tar,0,pivot-1);
        }
        else{
            return binarysearch(arr,tar,pivot+1,arr.length-1);
        }
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted, the we need to find right side so
          else if(arr[start]<=arr[mid] ){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarysearch(int arr[],int tar,int start,int end){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }return  -1;
    }
}
