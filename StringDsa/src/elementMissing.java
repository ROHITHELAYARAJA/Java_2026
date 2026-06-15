public class elementMissing {
    static void main() {
        String x = "asdwq";
        String y = "asdw";
        char  ans = answer(x,y);
        System.out.println(ans);
    }
    static char answer(String x,String y){
        for (int i = 0; i < y.length(); i++) {
            if(x.charAt(i)!=y.charAt(i)) {
                return x.charAt(i);
            }
        }
        return x.charAt(x.length()-1);
    }
}
