import java.util.*;
public class IsPalindrome {
    public static void main(String[] args) {
        String str = "#maa3dam@! ";
        System.out.println(solve(str.toLowerCase()));
    }
    public static boolean solve(String str){
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String reverse = sb.reverse().toString();
        return (reverse.equals((sb.toString())));
    }
}
