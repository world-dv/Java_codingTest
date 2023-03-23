import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            int count = 0;
            for(int j = 0; j < 4; j++) {
                if(sc.nextInt() == 1) {
                    count++;
                }
            }
            if(count == 3) {
                sb.append("A\n");
            } else if (count == 2) {
                sb.append("B\n");
            } else if (count == 1) {
                sb.append("C\n");
            } else if (count == 4) {
                sb.append("E\n");
            } else if (count == 0) {
                sb.append("D\n");
            }
        }
        System.out.println(sb);
    }
}
