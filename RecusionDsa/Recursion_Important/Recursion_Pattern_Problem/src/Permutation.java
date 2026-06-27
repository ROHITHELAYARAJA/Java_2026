import java.util.ArrayList;
import java.util.List;

public class Permutation {
   public static void main(String[] args) {
        permutation("","abc");
       System.out.println(permutationList("","abc"));

    }
    static void permutation(String p,String str){
       if(str.isEmpty()){
           System.out.println(p);
           return;
       }
       char ch = str.charAt(0);
       for(int i=0;i<=p.length();i++){
           String first = p.substring(0,i);
           String second = p.substring(i,p.length());
           permutation(first+ch+second,str.substring(1));
       }
    }


    static int permutationCount(String p,String up) {
        if(up.isEmpty()){
         return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
             count=+permutationCount(first+ch+second,up.substring(1));
        }
        return count;
    }

    static List<String> permutationList(String p, String up) {
        if(up.isEmpty()){
           List<String> list = new ArrayList<>();
           list.add(p);
           return list;

        }
        List<String> outer = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            outer.addAll(permutationList(first+ch+second,up.substring(1)));
        }
        return outer;
    }
}
