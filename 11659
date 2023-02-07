import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(str.nextToken());
        int repeat = Integer.parseInt(str.nextToken());
        long[] s = new long[n+1];
        str = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= n; i++) {
            s[i] = s[i-1]+Integer.parseInt(str.nextToken());
        }
        for(int i = 0; i < repeat; i++){
            str = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            System.out.println(s[b] - s[a-1]);
        }
        br.close();
    }
}
