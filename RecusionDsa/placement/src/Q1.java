import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        String str = "aaaallld";
        int ans = answer1(str);
        System.out.println(ans);
        List<Integer> x = answer2(Arrays.asList(1, 2, 4, 6, 9, 3));
        System.out.println(x);
        System.out.println(subcount("timdnstim", "tim"));
        int[] y = {1, 2, 3, 4, 5};
        System.out.println("count < numbers given the target " + count(y, 5));
        prime(11);
        int z = special("!@#$%^76");
        System.out.println(z);
    }

    static int answer1(String s) {
        int[] str = new int[26];
        for (int i : s.toCharArray()) {
            str[i - 'a']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (str[i] > 1) {
                max++;
            }
        }
        return max;
    }

    static List<Integer> answer2(List<Integer> list) {
        List<Integer> ans = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                ans.add(i);
            }
        }
        for (int i : list) {
            if (i % 2 != 0) {
                ans.add(i);
            }
        }
        return ans;
    }

    static int subcount(String str, String sub) {
        int len = sub.length();
        int c = 0;

        for (int i = 0; i <= str.length() - len; i++) {
            if (sub.charAt(0) == str.charAt(i)) {
                if (sub.equals(str.substring(i, i + len))) {
                    c++;
                }
            }
        }
        return c;
    }

    static int count(int[] arr, int tar) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < tar) c++;
        }
        return c;
    }

    static void prime(int x) {
        if (x <= 1) {
            System.out.println("");
            return;
        }
        int c = 1;
        for (int i = 2; i <=x; i++) {
            if (x % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        System.out.println("Count: " + c);
    }
    static int special(String str) {
        int count = 0;
        for(char ch:str.toCharArray()) {
            if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}
