import java.util.Arrays;


public class movezero {
    static void main() {
        int arr [] = {0,3,50,0,67,7,74,2,0};
        int ans[] = move2(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] move(int [] arr) {
        int index = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
            while (index < len) {
                arr[index++] = 0;
            }

        return arr;
    }

    static int[] move2(int[] arr) {
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    arr[index] = arr[i];

                    // clear old position using replace()
                    if (index != i) {
                        arr = replace(arr, i);
                    }

                    index++;
                }
            }
            return arr;
        }

        static int[] replace(int[] arr, int index) {
            arr[index] = 0;
            return arr;
        }
    }
