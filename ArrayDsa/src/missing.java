public class missing {
    static void main() {
        int [] arr = {1,2,3,4,5,6,8,9,10,11,12};
        int ans = miss(arr);
        System.out.println(ans);
    }
    static int miss(int[] arr) {
        int sum = 0;
        int n = arr.length+1;
        int a = (n * (n+1))/2;
        for (int i = 0; i < arr.length; i++){
            sum=sum+arr[i];
        }
       return a-sum;
    }
}
