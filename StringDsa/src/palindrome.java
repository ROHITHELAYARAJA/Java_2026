public class palindrome {
    static void main() {
        boolean answer = ispalindrome("abcocba");
        System.out.println(answer);
    }

    static boolean ispalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        int n = str.length() - 1;
        for (int i = 0; i < n; i++) {
            char start = str.charAt(i);
            char end = str.charAt(n - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

