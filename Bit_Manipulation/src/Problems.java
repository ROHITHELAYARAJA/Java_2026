public class Problems {
    static void main() {
        int x = 10;
        int y = 20;
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println(x+" "+y);
    }
}
