public class SecondLargest {
    public static void main(String args[]){
        int[] arr = {4,5,3,1,2};
        System.out.println(solve(arr));
        return;
    }
    public static int solve(int[] arr){
        if (arr.length <=1){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int Slargest= Integer.MIN_VALUE;
        for (int i:arr){
            if (i>largest){
                Slargest = largest;
                largest=i;
            }
            else if (i<largest && i>Slargest){
                Slargest =i;
            }
        }
        return Slargest;
    }
}
