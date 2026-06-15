import java.util.Arrays;

public class kunalMethods {
    static void main() {
        String name = "ROHITH";
        System.out.println(Arrays.toString( name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("       Rohith     ".strip());
        String x = (Arrays.toString("hi bro whats's happening".split(" ")));
        char ch = x.charAt(0);
        System.out.println(ch);
        System.out.println(("hi bro whats's happening".split(" ")).length-1);

        System.out.println(name.indexOf('O'));

    }
}
