import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 && y == 0) {
                break;
            }
            if(y % x == 0) {
                sb.append("factor\n");
            } else if (x % y == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }
        System.out.print(sb);
    }
}
