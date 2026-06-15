
class Solution {
    static void main() {
        int arr[] = {21,18,44,29};
        int ans = sumFourDivisors(arr);
        System.out.println(ans);
    }
   static int sumFourDivisors(int[] nums) {
     int len = nums.length;
     int ans = 0;
     for (int i=0;i<len;i++){
           int x = nums[i];
          int divisor = 1;
           int count=1;
          for(int j=2;j*j<=x;j++){
               if(x%j==0 ){
                 if(j==x/j){
                    divisor += j;
                    count++;
                   }
                 else{
                   divisor=divisor+j+x/j;
                   count+=2;
}
             }
              if(count>4){
                  break;
               }
          }
         divisor = divisor+x;
       count++;
       if(count==4){
            ans+=divisor;
          }
      }
      return ans;
  }
}
