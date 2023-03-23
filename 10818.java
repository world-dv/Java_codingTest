import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        int min = 1000000, max = -1000000;
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(str.nextToken());
            if(a < min) {
                min = a;
            } 
            if(a > max) {
                max = a;
            }
        }
        System.out.println(min + " " + max);
    }
}
