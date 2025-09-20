public class SecondLargest {
    public static void main(String args[]){
        int[] arr1 = {4,5,3,1,2};
        int[] arr2 ={5,5,4};
        System.out.println(solve(arr1));
        System.out.println(solve((arr2)));
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
