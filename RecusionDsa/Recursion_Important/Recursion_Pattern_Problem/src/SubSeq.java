import java.util.*;
public class SubSeq {
    static void main() {
//        System.out.println("SubSeq".substring(1));
        printSubSeq("","abc");
        System.out.println(printSubSeqList("","abc",new ArrayList<>()));
        System.out.println(printSubSeqListInsideFunctionCall("","abc"));

    }
    static void printSubSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        printSubSeq(p+ch, up.substring(1));
        printSubSeq(p, up.substring(1));
    }
    static ArrayList<String> printSubSeqList(String p, String up,ArrayList<String> lst) {
        if(up.isEmpty()) {
            lst.add(p);
            return  lst;
        }
        char ch = up.charAt(0);
        printSubSeqList(p+ch, up.substring(1),lst);
        printSubSeqList(p, up.substring(1),lst);
        return lst;
    }

    static ArrayList<String> printSubSeqListInsideFunctionCall(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> lst = new ArrayList<>();
            lst.add(p);
            return  lst;
        }
        char ch = up.charAt(0);
      ArrayList<String> left= printSubSeqListInsideFunctionCall(p+ch, up.substring(1));
      ArrayList<String>right = printSubSeqListInsideFunctionCall(p, up.substring(1));
      left.addAll(right);
      return left;
    }
}
