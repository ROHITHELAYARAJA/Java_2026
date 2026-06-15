public class GCD_LCM {
    static void main() {
        int x = 4;
        int y = 8;
        System.out.println(gcd(x,y));
        System.out.println(lcm(x,y));
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
