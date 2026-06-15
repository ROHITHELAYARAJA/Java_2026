public class kademsalgorithm {
    static void main() {
    int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:arr){
            sum = sum + i;
            max = Math.max(sum,max);
            if(sum<0){
                sum = 0;
            }
        } return max;

    }

    }

