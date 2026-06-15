import java.lang.reflect.Array;
import java.util.Arrays;

public class Blitz {
    static void main() {

        if (("rohith").length() >= 6) System.out.println("valid");
        else System.out.println("invalid");

        String x = "java is very easy";
        int c = 0;
        for (char i : (x.toCharArray())) {
            if (i == ' ') {
                c++;
            }
        }
        System.out.println(c);
        System.out.println(("hi bro whats's happening hi".split(" ")).length - 1);

        String name = "programing";
        String answer = RLE(name);
        System.out.println(answer);
        Letter_Digit("a1b2");
        String St_name [] = {"rohith","prasad","noob"};
        int [] St_mark = {1,2,3};
        Arr_Str(St_name,St_mark);
        String [] Vowel = {"abc","company","is"};
        vowel(Vowel);
    }

    static String RLE(String x) {
        int count = 1;
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < x.length(); i++) {
            if (i < x.length() && x.charAt(i) == x.charAt(i - 1)) {
                count++;
            } else {
                ans.append(x.charAt(i - 1));
                ans.append(count);
                count = 1;
            }

        }
        ans.append(x.charAt(x.length() - 1)); // 'b'
        ans.append(count);                    // 2

        return ans.toString();
    }
    static  void  Occurence(String q) {
        q = Arrays.toString(("programming").split(""));
        int ocurence = 0;
        for (int i = 0; i < q.length(); i++) {
            if (q.charAt(i) == 'g') {
                ocurence++;
            }
        }
        System.out.println(ocurence);
    }
    static void Letter_Digit(String ld){
        ld = Arrays.toString(ld.split("")); //[r,1,h,3,t,h]
        String x = ""; // int
        String y = ""; // string
        for(int i = 0; i < ld.length(); i++){
            char ch = ld.charAt(i);
            if(Character.isDigit(ch)) x=x+ch;
            if (Character.isLetter(ch))y=y+ch;
        }
        System.out.println(x);
        System.out.println(y);
    }
    static void Arr_Str(String [] name,int [] mark){
        for (int i = 0; i < name.length; i++) {
            String ch  = name[i];
            if(ch=="rohith") System.out.println(mark[i]);
        }
    }
    static void vowel(String x[]){

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            String ch = x[i];
            char c = ch.charAt(0);
            if(c=='a' || c=='e' ||c=='i' ||c=='o' ||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

}
