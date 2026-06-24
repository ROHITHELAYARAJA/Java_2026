import java.util.ArrayList;
import java.util.List;

public class Leetcode46 {
    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();

        int[] nums = {1, 2, 3};

        helper(nums, new ArrayList<>(), ans);

        System.out.println("\nFinal Answer:");
        System.out.println(ans);
    }

    static void helper(int[] nums,
                       List<Integer> current,
                       List<List<Integer>> ans) {

        System.out.println("Entered: " + current);

        if (current.size() == nums.length) {

            System.out.println("Permutation Found: " + current);

            ans.add(new ArrayList<>(current));

            return;
        }

        for (int num : nums) {

            System.out.println("Trying " + num +
                    " in " + current);

            if (current.contains(num)) {

                System.out.println(num +
                        " already present, skipping");

                continue;
            }

            current.add(num);

            System.out.println("After Add: " + current);

            helper(nums, current, ans);

            System.out.println("Before Remove: " + current);

            current.remove(current.size() - 1);

            System.out.println("After Remove: " + current);
        }
    }
}
