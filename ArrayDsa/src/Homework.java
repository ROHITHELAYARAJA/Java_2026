public class Homework {
    static void main() {
        String rev = reverse("HELL");
        int arr1[] = {0,-2,1,4,9};
        int ans = secondlargest(arr1);
        int [] arr2 = { 1,2,4,5,6};
        int sol = missing(arr2);
        boolean year = leap(2000);
        int fac = factoial(5);
        System.out.println(fac);
        System.out.println(year);
        System.out.println(sol);
        System.out.println(ans);

    }
    static int countvowel(String x){
        int count = 0;
        String y= x.toLowerCase();
        for(int i=0;i<y.length();i++){
            if(y.charAt(i)=='a' || y.charAt(i)=='e' ||y.charAt(i)=='i' ||y.charAt(i)=='o' ||y.charAt(i)=='u' ){
                count++;
            }
        }
        return count;
    }
    static String reverse(String x){
        String ans="";
        for(int i=x.length()-1;i>=0;i--){
            ans = ans+x.charAt(i);
        }
        return ans;
    }
    static int secondlargest(int []arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int currenelement =  arr[i];
            if(currenelement>first){
                second = first;
                first = currenelement;
            }
            else if(currenelement>second && currenelement!=first){
                second = currenelement;
            }
        }
        return second;
    }
    static int missing(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i:arr){
            sum = sum+i;
        }
        int x = (n*(n+1))/2;
        return  sum-x;
    }
    static boolean leap(int n){
        if(n%4==0 && n%100!=0 || n%400==0){
            return true;
        }
        else {
            return false;
        }
    }
    static int factoial(int n){
        int fact = 1;
        if(n==0 || n==1){
            return 1;
        }
        else{
            for (int i = 2; i <= n; i++) {
                fact = fact*i;
            }
        }
        return fact;
    }

}
