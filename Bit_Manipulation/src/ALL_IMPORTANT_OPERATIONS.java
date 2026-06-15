public class ALL_IMPORTANT_OPERATIONS {
    public static void main(String[] args) {
        int x = 9;
        boolean answer = odd(x);
        System.out.println(answer);
        int arr[] = {1,1,3,3,2,5,5};
        System.out.println(unique(arr));
        System.out.println("checking the ith bit "+" "+check_ithBit(x,3));
        System.out.println("Setting the ith bit "+" "+set_ithBit(x,2));
        System.out.println("Counting the number of digits"+" "+NoOfDigit(10,2));
    }
    public static boolean odd(int a) {
        return (a&1)==1;
    }
    public static int unique(int[] arr) {
        int uni = 0;
        for(int i:arr){
            uni^=i;
        }
        return uni;
    }
    public static int check_ithBit(int a,int b){
        int x = a&(1<<(b));
        return x;
    }
    public static int set_ithBit(int a,int b){
        int x = a|(1<<(b));
        return x;
    }

    public static int NoOfDigit(int n ,int b){
        int result = (int)(Math.log(n)/Math.log(b))+1;
        return result;
    }

}
