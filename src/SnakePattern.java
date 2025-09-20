import java.util.*;
public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int dummy=0;
            for (int j=1;j<=i;j++){
                System.out.print(i+dummy+" ");
                dummy += n-j;
            }
            System.out.println();
        }
    }
}
