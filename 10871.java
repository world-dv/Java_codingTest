import java.util.StringTokenizer;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(str.nextToken());
        int x = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int b = 0;
        for(int i = 0; i < n; i++) {
            b = Integer.parseInt(str.nextToken());
            if(b < x) {
                sb.append(b + " ");
            }
            b = 0;
        }
        br.close();
        System.out.println(sb);
    }
}
