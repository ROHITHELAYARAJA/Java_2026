

public class Xor_AtoB {

    static void main() {
        int a = 3;
        int b = 9;

        int ans = xor(b)^xor(a-1);
        System.out.println(ans);

        // this is only for checking purpose because the tle exceeded

        int ans2 = 0;
        for (int i = a; i<=b ; i++) {
            ans2=ans2^i;
        }
        System.out.println(ans2);

    }
    public static int xor(int a) {

        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2) {
            return a + 1;
        }
        return 0;
    }

}
