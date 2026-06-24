import java.util.ArrayList;

public class DIce_Amazon {
    static void main() {
        dice("",4);
        System.out.println(diceLst("",4));
        System.out.println(counteeDice("",4));

    }

    static  void dice(String p ,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }

    static ArrayList<String> diceLst(String p , int target){
        if(target==0){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list  = new ArrayList<>();
        for (int i=1;i<=6 && i<=target;i++){
            list.addAll(diceLst(p+i,target-i));
        }
        return list;
    }

    static  int counteeDice(String p ,int target){
        if(target==0){
           return 1;
        }
        int count = 0;
        for (int i=1;i<=6 && i<=target;i++){
            count+=counteeDice(p+i,target-i);
        }
        return count;
    }
}
