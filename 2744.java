import java.util.Scanner;
import java.lang.StringBuilder;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                sb.append((String.valueOf(s.charAt(i))).toUpperCase());
            } else {
                sb.append((String.valueOf(s.charAt(i))).toLowerCase());
            }
        }
        System.out.println(sb);
    }
}
