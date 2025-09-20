import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FindLeaders {
    public static void main(String[] args) {
        // greatest element to the right of each element
        int[] arr ={16,17,4,3,5,2};
        int r = arr.length-1;
        int max = Integer.MIN_VALUE;
        while (r>=0){
            if (arr[r]>max){
                System.out.println(arr[r]);
                max= arr[r];
            }
            r--;
        }
    }

}
