public class String_Pattern_FAANG {
    static void main() {
        skip("","baabcs");
        System.out.println(skip("baabcs"));
        System.out.println(skipBadam("I LOVE YOU  badam"));
        System.out.println(skipBadNotBadam("I LOVE YOU bad badam"));
    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }
    static String skipBadam(String up){
        if(up.isEmpty()){
            return "";
        }
       if(up.startsWith("badam")){
            return skipBadam(up.substring(5));
        }
        else{
            return up.charAt(0)+skipBadam(up.substring(1));
        }
    }

    static String skipBadNotBadam(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("bad")&!up.startsWith("badam")){
            return skipBadNotBadam(up.substring(3));
        }
        else{
            return up.charAt(0)+skipBadNotBadam(up.substring(1));
        }
    }
}
