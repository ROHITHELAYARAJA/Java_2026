public class homework {
    static void main() {
        String x = "jakakd";
        String ans = RLE(x);
        System.out.println(ans);
    }
    static  String removeDuplicate(String x) {
        String ans = "";
        for (int i = 0; i < x.length(); i++) {
            if(ans.indexOf(String.valueOf(x.charAt(i))) == -1) {
                ans += String.valueOf(x.charAt(i));
            }
        }
        return ans;
    }
    static String RLE(String x ){
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for(int i=1;i<x.length();i++){
            if(i<x.length() && x.charAt(i)==x.charAt(i-1)){
                count++;
            }
            else{
                ans.append(x.charAt(i-1));
                ans.append(count);
                count = 1;
            }

        }
        ans.append(x.charAt(x.length() - 1)); // 'b'
        ans.append(count);                    // 2

        return ans.toString();
    }

    static String reverse(String x){
        StringBuilder ans = new StringBuilder();
        for (int i = x.length()-1; i >= 0 ; i--) {
            ans.append(x.charAt(i));
        }
        return ans.toString();
    }
}
