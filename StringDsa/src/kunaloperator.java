import java.util.*;
public class kunaloperator {
    static void main() {
        System.out.println('a'+'b');
        System.out.println("a"+"b");  //  in java the + is operator overloading
        System.out.println("a"+'a');
        System.out.println('a'+3);
        System.out.println((char)('a'+3));
        System.out.println("a"+1); // here thee integer will be converted into Integer that will call toString()
        // after few steps this will be "a"+"1"
        System.out.println("rohith"+new ArrayList<>());
        System.out.println("rohith"+new HashSet<>());
        System.out.println("rohith"+new Integer (100));
        System.out.println(new ArrayList<>()+""+new Integer(100));
    }
}
