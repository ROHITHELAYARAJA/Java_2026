import java.util.ArrayList;

public class LinearSearch {
    static void main() {
        // In every call the i is the index position 0.
        int arr[] = {1,24,5,7,9,9};
        int tar = 9;
        System.out.println(search(arr,tar,0));
        System.out.println(searchInd(arr,tar,0));
        System.out.println(searchIndlast(arr,tar,arr.length-1));
        searchIndAll(arr,tar,0);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> ans = AllInd(arr,tar,0,list1);
        System.out.println(ans);
        System.out.println(list1);
        System.out.println(AllInd2(arr,tar,0));

    }
    static boolean search(int [] arr,int tar,int i){
        if(i==arr.length){
            return false;
        }
        return arr[i]==tar || search(arr,tar,i+1);
    }
    static int searchInd(int [] arr,int tar,int i){
        if(i==arr.length){
            return -1;
        }
        if( arr[i]==tar){
            return i;
        }
        else
        {
            return searchInd(arr,tar,i+1);
        }
    }
    static int searchIndlast(int [] arr,int tar,int i){
        if(i==-1){
            return -1;
        }
        if( arr[i]==tar){
            return i;
        }
        else
        {
            return searchInd(arr,tar,i-1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void searchIndAll(int [] arr,int tar,int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==tar){
            list.add(i);
        }
        searchIndAll(arr,tar,i+1);
    }
    static ArrayList<Integer> AllInd(int [] arr,int tar,int i,ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == tar) {
            list.add(i);
        }
        return AllInd(arr, tar, i + 1, list);
    }

    static ArrayList<Integer> AllInd2(int [] arr,int tar,int i) {
        ArrayList<Integer> list =  new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
//      every function call has it's own answer
        if (arr[i] == tar) {
            list.add(i);
        }
        ArrayList<Integer> allBelowCalls = AllInd2(arr, tar, i + 1);
        list.addAll(allBelowCalls);
        return list;
    }

}
