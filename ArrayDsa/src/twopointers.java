public class twopointers {
    static void main() {
        int arr [] = {1,2,3,4,5,6};
        int tar =3;
        boolean ans = sum(arr , tar);
        System.out.println(ans);
    }
    static boolean sum(int[] arr , int target) {
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            } else if (sum > target) {
                right--;
            }
            else {
                left++;
            }
        } return false;
    }
}
