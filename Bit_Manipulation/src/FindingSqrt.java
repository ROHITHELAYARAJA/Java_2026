public class FindingSqrt {
    static void main() {
        int n = 40;
        int p=3;
        sqrt(n,p);

    }

    // O(log(N))
    static void sqrt(int n,int p){

        int st = 0;
        int end = n;
        double ans  = 0;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid*mid==n){
                ans = mid;
            }
            else if(mid*mid>n){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while (ans*ans<=n){
                ans+=incr;
            }
            ans-=incr;
            incr/=10;
        }

        System.out.printf("%.3f",ans);
    }
}
