public class NewtonSqrt {
    static void main() {
        int n = 40;
        newtonSqrt(n);
    }
    static void newtonSqrt(double n) {
        double x = n;
        double root;
        int count = 0;
        while (true) {
            count++;
            root = 0.5*(x+n/x);
            if (Math.abs(root-x)<0.000001) {
                break;
            }
            x = root;
        }
        System.out.println(root);
        System.out.println(count);
    }
}
