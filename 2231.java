import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        for(int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            int sum = 0;
            for(int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            if(sum + i == n) {
                System.out.println(i);
                break;
            } else if(i == n) {
                System.out.println(0);
            }
        }
    }
}
