public class leet1 {
    static void main() {
        int num [] = {12,23,222,3333};
        int count = 0;
        for(int i=0;i<num.length;i++) {
            if(evensum(num[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
        static boolean evensum(int num){
        int ans = check(num);
        return ans%2==0;
    }
    static int check(int num){
        if(num<0){
            num=num*-1;
        }
        return (int) (Math.log10(num)+1);
    }
    }