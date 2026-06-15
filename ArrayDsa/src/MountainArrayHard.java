public class MountainArrayHard {
    static void main() {
        int arr [] = {1,2,3,4,5,3,1};
        int tar = 3;
        int solution = ans(arr,tar);
         System.out.println(solution);
    }
    static int ans(int[] arr,int tar){
        int search = pk(arr);
        int answer = orderagnosticBS(arr,tar,0,search);
        if(answer!=-1){
        return answer;
        }
        else{
            return orderagnosticBS(arr,tar,search+1, arr.length-1);
        }
    }
    static int pk(int[] arr1) {
        int start = 0;
        int end = arr1.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr1[mid] > arr1[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
    static int orderagnosticBS(int []arr2,int target , int start, int end) {
        boolean isassending = arr2[start]<arr2[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr2[mid]==target){
                return mid;
            }
            if(isassending) {
                if (target > arr2[mid]) {
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }
            else{
                if (target <arr2[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }

        }return  -1;
    }
}
