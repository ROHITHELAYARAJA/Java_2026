public class set_ithBit {
    static void main() {
        int x = 13;
        int y = 2;
        System.out.println((x&(1<<y))!=0);
        System.out.println(((x>>y)&1)==1);
    }
}
