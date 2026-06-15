public class String_Binary {
    public static void main(String[] args) {
        String x ="1010";
        int result = 0;
        int pow = 0;
        for(int i=x.length()-1;i>=0;i--){
            int bit = x.charAt(i)-'0';
            result += bit*Math.pow(2, pow++);
        }
        System.out.println(result);
        int res = 0;
        for(char c1 : x.toCharArray()){
            res=res<<1;
            res+=c1-'0';
        }
        System.out.println(res);
    }
}
