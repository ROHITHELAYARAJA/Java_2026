

public class check_array_sorted {
    static void main() {
        int [] arr = {1,21,3,4,5};
        System.out.println(sort(arr,0));

    }
    static boolean sort(int [] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1]&&sort(arr,i+1);
    }
}
