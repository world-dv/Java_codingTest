import java.lang.StringBuilder;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int x = Integer.parseInt(br.readLine());
            if(x == -1) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int i = 1; i < x; i++) {
                if(x % i == 0) {
                    sum += i;
                    sb.append(i + " + ");
                }
            }
            if(sum != x ){
                System.out.println(x + " is NOT perfect.");
                continue;
            }
            sb.delete(sb.length()-3, sb.length());
            System.out.print(x + " = ");
            System.out.println(sb);
        }
        br.close();
    }
}
