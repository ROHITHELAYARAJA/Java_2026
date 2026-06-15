public class LongestCommonPrefix {
    public static void main(String [] args) {
        String [] arr = {"flow","flower","float","flight"};
        String ans = longestprfix(arr);
        System.out.println(ans);
    }
    static String  longestprfix(String[] arr) {
        if(arr.length==0 || arr==null){
            return " ";
        }
        String prefix = arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)==-1){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
