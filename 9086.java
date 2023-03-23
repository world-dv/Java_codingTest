import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            String a = String.valueOf(s.charAt(0));
            String b = String.valueOf(s.charAt(s.length() - 1));
            System.out.println(a+b);
        }
    }
}
