import java.util.*;

public class buystocksell {
    static void main() {
    int arr [] = {7,5,6,1,9};
    int ans = maxProfit(arr);
        System.out.println(ans);
    }
    static int maxProfit(int[] arr) {
        int mini = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost  = arr[i]-mini;
            profit = maxvalue(profit, cost);
            mini = minivalue(mini,arr[i]);
        }
        return profit;
    }
    static int maxvalue (int profit , int cost){
        if(profit < cost){
            profit = cost;
        }
        return profit;
    }
    static int minivalue (int mini, int current){
        if(mini < current){
            current= mini;
        }
        return current;
    }
}

