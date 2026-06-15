public class infinteBinary {
    static void main() {
        int arr [] = {1,2,3,4,5,6,7,8,9,10,12,14,19,34};
        int tar = 6;
        int ans = findLengths(arr,tar);
        System.out.println(ans);
    }
    static int findLengths(int [] arr,int tar){
        int start = 0;
        int end = 1;
        while (tar>arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        } return binary(arr,tar,start,end);
    }
    static int binary(int [] arr1,  int tar1,int  start, int end){

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (tar1 > arr1[mid]) {
                start = mid + 1;
            } else if (tar1 < arr1[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }return  -1;
    }
}
