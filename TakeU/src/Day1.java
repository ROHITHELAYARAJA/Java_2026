import java.util.Arrays;

public class Day1 {
    static void main() {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(left_rotate(arr)));
    }
    static int [] left_rotate(int[] arr) {
        // time complexity=o(n) ,  space complexity=o(1)
        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        return arr;
    }
}

