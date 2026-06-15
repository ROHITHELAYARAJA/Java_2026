public class LongestRepeated {
    public static void main(String[] args) {
        String str = "WSSSA";
        int k = 1;
        int ans = answer(str, k);
        System.out.println(ans);
    }

    static int answer(String str, int k) {
        int[] alphabet = new int[26];
        int left = 0;
        int ans = 0;
        int max_occurance = 0;
        for (int right = 0; right < str.length() ; right++) {
            max_occurance = Math.max(max_occurance,++alphabet[str.charAt(right) - 'A']);
            if((right-left+1)-max_occurance>k){
                alphabet[str.charAt(right)-'A']--;
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
    return ans;
}
}
