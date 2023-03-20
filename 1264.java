import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int count = 0;
            String s = sc.nextLine();
            if(s.equals("#")) {
                break;
            }
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    count++;
                }
                if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                    count++;
                }
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }
}
