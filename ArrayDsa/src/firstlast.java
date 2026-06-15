public class firstlast {
    static void main() {
        int arr [] ={1,2,4,4,4,4,5,6,7};
        int tar = 4;
        int ans []= position(arr,tar);
        System.out.println(ans[0]+","+ans[1]);

    }
    static int []position(int arr[],int tar){
        int first = search(arr,tar,true);
       int last = search(arr,tar,false);
        return new int [] {first,last};
    }
    static int search(int [] arr,int tar,boolean find){
        int start =0;
        int end  = arr.length-1;
        int res = -1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (tar > arr[mid]) {
                start = mid + 1;
            } else if (tar < arr[mid]) {
                end = mid - 1;
            } else {
                res = mid;
                if(find){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }
        }return  res;
    }

}
