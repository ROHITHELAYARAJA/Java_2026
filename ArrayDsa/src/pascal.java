import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args) {
        System.out.println(trinagle(5));
    }
    static ArrayList<Integer> answer(int n ){
        ArrayList<Integer> res =new ArrayList<>();
        int ans = 1;
        res.add(ans);
        for(int col=1;col<n;col++){
            ans = (ans*(n-col))/col;
            res.add(ans);
        }
        return res;
    }

    static List<List<Integer>> trinagle(int n){
        List<List<Integer>> reult = new ArrayList<>();
        for(int i=1;i<=n;i++){
            reult.add(answer(i));
        }
        return reult;
    }

}
