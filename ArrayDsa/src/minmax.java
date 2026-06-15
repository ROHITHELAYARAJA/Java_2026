import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
        // fourth <- third
        // third  ← second
        // second ← first
        // first  ← current
        int arr[] = {1,2,0,6,5,7,10};
        int ans[]  = findMax(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findMin(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        int fourth = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                fourth=third;
                third=second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]<second && arr[i]!=first){
                fourth = third;
                third = second;
                second = arr[i];
            }
            else if (arr[i]<third && arr[i]!=second){
                fourth = third;
                third = arr[i];
            }
            else if(arr[i]<fourth){
                fourth = arr[i];
            }
        }
        return new int [] {first,second,third,fourth};

    }

    static int[] findMax(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                fourth=third;
                third=second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                fourth = third;
                third = second;
                second = arr[i];
            }
            else if (arr[i]>third && arr[i]!=second){
                fourth = third;
                third = arr[i];
            }
            else if(arr[i]>fourth){
                fourth = arr[i];
            }
        }
        return new int [] {first,second,third,fourth};
    }
}
