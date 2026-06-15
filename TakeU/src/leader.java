import java.util.ArrayList;

public class leader {
    static void main() {
        int [] arr ={17,2,3,10,1};
        System.out.println(answer(arr));
    }
    static ArrayList<Integer> answer (int [] nums){
        ArrayList<Integer> ans = new ArrayList<>();

        int max = nums[nums.length-1];
        ans.add(max);
        for(int i=nums.length-2;i>=0;i--){

            if(nums[i]>max){
                max =  nums[i];
                ans.add(max);
            }
        }

        return ans;
    }
}
