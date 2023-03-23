import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        arr[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j * i <= n; j++) {
                arr[i*j] = 1;
            }
        }
        for(int i = m; i <= n; i++) {
            if(arr[i] != 1) {
                System.out.println(i);
            }
        }
        br.close();
    }
}
