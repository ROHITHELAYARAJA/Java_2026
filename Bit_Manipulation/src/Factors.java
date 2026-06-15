public class Factors {
    static void main() {
        int n = 20;
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
        System.out.println(n);

        fac(n);
    }
    static void fac(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){

                if(n/i==i ){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" "+n/i+" ");
                }
            }
        }
    }
}
