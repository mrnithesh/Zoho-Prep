public class FindMissingNumber {
    public static void main(String[] args) {
        int [] arr={3,1,0};
        System.out.println(solve(arr));
    }
    public static int solve(int[] arr){
        int n = arr.length;
        int req = n*(n+1)/2;
        int act = 0;
        for (int i:arr){
            act+=i;
        }
        return req-act;
    }
}

