public class linear {
    public static void main() {

        String name = "Rohith";
        char target = 'o';
        boolean ans = search(name, target);
        System.out.println(ans);
    }

        static boolean search (String x,char y){
            if (x.length() == 0) {
                return false;
            }
            for (int i = 0; i < x.length(); i++) {
                if (y == x.charAt(i)) {
                    return true;
                }
            }
            return false;
        }

}

