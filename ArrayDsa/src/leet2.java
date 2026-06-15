import java.util.Arrays;

public class leet2 {
    static void main() {
        int arr [] [] = {{1,2,3},{6,7,8},{1,91,1}};
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] arr) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        } return ans;
    }
}
