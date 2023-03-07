import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        for(int i = 0; i < 5; i++) {
            String s = sc.next();
            if(s.charAt(s.length()-1) == n.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
