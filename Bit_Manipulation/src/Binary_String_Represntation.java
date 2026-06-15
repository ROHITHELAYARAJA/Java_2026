public class Binary_String_Represntation {
    public static void main(String[] args) {
        int x = 40;
        String s = Integer.toBinaryString(x);
        System.out.println(s);

        String s1="";
        while (x!=0){
          if(x%2==1){
             s1 = s1 + "1";
          }
          else {
              s1 = s1 + "0";
          }
          x=x/2;
      }
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2 +=  s1.charAt(i);
        }
        System.out.println(s2);

                int i = 40;

                StringBuilder sb = new StringBuilder();

                while (i != 0) {
                    if (i % 2 == 1) {
                        sb.append('1');
                    } else {
                        sb.append('0');
                    }
                    i = i / 2;
                }

                System.out.println(sb.reverse().toString());
    }
}
