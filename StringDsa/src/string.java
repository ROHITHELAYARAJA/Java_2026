import java.util.*;
public class string {
    static void main() {
        int a = 10;
     String x = String.valueOf(a);
     System.out.println(x);
     String y = String.format("pi = %.6f", Math.PI);
        System.out.println(y);
        String z = "BOSSSSSS";
        StringBuilder c= str(z);
        System.out.println(c);
    }
    static StringBuilder str(String s) {
        StringBuilder x =  new StringBuilder();
        x.append(s);
        x.insert(3,"hii");
        x.delete(0,2);
        x.reverse();
        return x;
    }

    public int length() {
        return 0;
    }
}
