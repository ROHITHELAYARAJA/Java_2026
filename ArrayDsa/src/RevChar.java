import java.lang.reflect.Array;

public class RevChar {
    static void main() {
        char [] s = {'m','e','t','i'};
        rev (s);
        System.out.println(s);
    } static void rev(char[] s){
            int start = 0;
            int end = s.length-1;
            while(start<end){
                char temp = s[start];
                s[start] = s[end];
                s[end]  = temp;
                start++;
                end--;
            }
        }
    }
