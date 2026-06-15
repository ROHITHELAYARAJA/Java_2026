import java.util.Arrays;

public class reverse {
    static void main() {
        String x = "KING";
        StringBuilder ans = rev(x);
        System.out.println(ans);
    }
    static StringBuilder rev(String s) {
        StringBuilder ans = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while(left<=right){
            char temp = s.charAt(left);
            ans.setCharAt(left,ans.charAt(right));
            ans.setCharAt(right,temp);
            left++;
            right--;
        }
        return ans;
    }
}
