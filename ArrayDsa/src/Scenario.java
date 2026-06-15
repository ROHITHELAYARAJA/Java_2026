public class Scenario {
    static void main() {
        int [] mark = {60,70,80,90,50};
        int ans = avg(mark);
        System.out.println(ans);
    }
    static int  avg(int[] mark) {
        int sum = 0;
        int c = 0;
        for(int i = 0; i < mark.length; i++){
            sum = sum=+mark[i];
        }
        int n =  mark.length;
        int x = sum/n;

        for (int i = 0; i < mark.length; i++) {
            if(mark[i]>x){
                c++;
            }
        }
        return  c;
    }
}
