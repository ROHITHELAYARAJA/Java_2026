public class Nto1 {

    static void main() {
        System.out.println(prodofdigit(125));
        rev1(1234);
        System.out.println(temp);
        System.out.println(rev2(1234));
        System.out.println(palindrome(121));
        countzero(123000009);
        System.out.println(count);
    }
    static void fun1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun1(n-1);
    }

    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);

    }
    static void funboth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }

    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumofdigit(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sumofdigit(n/10);
    }
    static int prodofdigit(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)*prodofdigit(n/10);
    }

    static int temp=0;
    static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem = n%10;
        temp=temp*10+rem;
        n=n/10;
        rev1(n);
    }

    static int rev2(int n){
        int digit = (int)Math.log10(n)+1;
        return helper(n,digit);
    }

    private static int helper(int n, int digit) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int) Math.pow(10,digit-1)+helper(n/10,digit-1);
    }

    static boolean palindrome(int n){
        return n==rev2(n);
    }

    static int count = 0;
    static void countzero(int n){
        if(n==0){
            return;
        }
        if(n%10==0){
            count++;
        }
        countzero(n/10);
    }
}
