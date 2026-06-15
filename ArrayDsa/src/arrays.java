public class arrays {
    static void main() {
        int [] x = {1,2,4,5,3,6,7};
        int t = 3;
        int ans = linearsearch(x,t);
        int ans2 = linearsearch2(x,t);
        boolean ans3 = linearsearch3(x,t);

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);



    }
    static int linearsearch(int [] arr,int target){
      for (int i = 0;i<arr.length;i++){
          if(arr[i]==target){
              return i;
          }
        } return -1;
    }

    static int linearsearch2(int [] arr,int target){
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return target;
            }
        } return -1;
    }

    static boolean linearsearch3(int [] arr,int target){
        for (int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        } return false;
    }

}
