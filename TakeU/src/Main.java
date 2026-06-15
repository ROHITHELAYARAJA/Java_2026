class Solution {
    // Function to find maximum consecutive 1's in an array
    public int findMaxConsecutiveOnes(int[] nums) {
        // Variable to store current count of consecutive 1's
        int cnt = 0;
        // Variable to store maximum consecutive 1's
        int maxi = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is 1, increment count
            if (nums[i] == 1) {
                cnt++;
            } else {
                // If element is 0, reset count
                cnt = 0;
            }

            // Update maximum if current count is greater
            maxi = Math.max(maxi, cnt);
        }

        // Return maximum consecutive 1's
        return maxi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 1, 0, 1, 1, 1};

        // Create Solution object
        Solution obj = new Solution();

        // Get answer
        int ans = obj.findMaxConsecutiveOnes(nums);

        // Print result
        System.out.println("The maximum consecutive 1's are " + ans);
    }
}
