import java.util.Arrays;

public class smallcharacter {
    static void main() {
        char arr[] = {'c','f','j'};
        char target = 'c';
        System.out.println((ceil(arr,target)));
    }
    static char ceil(char [] arr, char target){
        int start =0;
        int end  = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if ( target>=arr[mid]) {
                start = mid +1;
            } else   {
                end = mid -1;
            }
        }return  arr[start%arr.length];
    }

}
