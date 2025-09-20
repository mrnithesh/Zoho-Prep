public class FindArrayMaxNumber {
    public static void main(String[] args) {
        //max number which can formed using the numbers in the array
        //naive - sort the array, descending, print - O(n logN)
        //optimal needed in o(n)
        int[] arr = {1,4,2,9,1};
        int[] count = new int[10];
        for (int i: arr){
            count[i] +=1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=9;i>=0;i--){
            while(count[i]>0){
                sb.append(i);
                count[i]--;
            }
        }
        System.out.println(sb);

    }
}
