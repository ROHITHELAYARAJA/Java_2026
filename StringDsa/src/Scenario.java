import java.util.Arrays;

public class Scenario {
    public static void main(String[] args) {
        String x  = "abc bd bosos";
        lastword(x);
    }
    static void reverseEachWord(String s) {
        String result = "";
        String word = "";

        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ')
                word = c + word;
            else {
                result += word + " ";
                word = "";
            }
        }
        result += word;
        System.out.println("Reversed Words: " + result);
    }
    static void reverseWord2(String word) {

        String x [] = word.split(" ");
        for (int i = 0; i < x.length; i++) {
            String y = x[i];
            String result = "";
            for (int j = y.length()-1; j >= 0; j--) {
                result = result+y.charAt(j);
            }
            System.out.print(result);
        }
    }
    static void Firstnonrepeating(String word) {
    for (int i=0;i<word.length();i++) {
    char c = word.charAt(i);
    if(word.indexOf(c)==word.lastIndexOf(c)){
        System.out.print(word.charAt(i));
        break;
    }
     }
    }
        static void  findMax(String array) {
            char first = 'a';
            char second  = 'z';


            for(int i=0;i<=array.length()-1;i++){
                char c = array.charAt(i);
                if(c>first){

                    first =c;
                }
                if(c<second){
                    second = c;
                }

            }
            System.out.println(first+" "+second);
        }
        static  void findMax2(String array) {
            char x [] = array.toCharArray();
            Arrays.sort(x);
            System.out.println(x[0]);
            System.out.println(x[array.length()-1]);
        }
        static  void lastword (String word) {
          int count = 0;
          word = word.trim();


          for (int i=word.length()-1;i>=0;i--){
              char c = word.charAt(i);
              if(c!=' '){
                  count++;
              }

              else{
                  break;
              }
          }
            System.out.println(count);

        }
}
