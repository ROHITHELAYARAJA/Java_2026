import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.swap;

public class DuplicateArr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2,55,55,6,6,2,3,3}; // [2,55,6,3]
        List <Integer>ans = cycle1(arr);
        System.out.println(ans);
    }

    static List<Integer> cycle1(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != i + 1) {
                int x = arr[i] - 1;

                if (arr[i] < n && arr[i] != arr[x]) {
                    swap(arr, i, x);
                } else {
                    if (!list.contains(arr[i])) {
                        list.add(arr[i]);
                    }
                    i++;
                }
            } else {
                i++;
            }
        }
        return list;
    }

      static   void swap ( int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

    }
