import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        if(a1 < 0 || a0 < 0) {
            if((a1 * n0 + a0 <= c * n0) && (a1 <= c)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else if(a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        br.close();
    }
}
