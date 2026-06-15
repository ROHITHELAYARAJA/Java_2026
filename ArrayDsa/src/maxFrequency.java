import java.util.Arrays;
public class maxFrequency {
    static void main() {
        int [] arr = {10,40,40,40,10,5};
       answer(arr);
    }

    static void answer(int[] arr) {
        int n=arr.length;
        int [] values = new int [n];
        int [] freq = new int [n];
        Arrays.sort(arr);
        int index = 0;
        for(int i=0;i<n;i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            values[index] = arr[i];
            freq[index] = count;
            index++;
        }

        for(int k=0;k<index;k++){
            int max_index = 0;
            for(int i=1;i<freq.length;i++){
                if(freq[i]>freq[max_index]) {
                    max_index = i;
                }
            }
            for (int j=0;j< freq[max_index];j++){
                System.out.print(" "+values[max_index]+" ");
            }
            freq[max_index]=0;
        }
    }
}
