import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int count = 0;
        int[] a = new int[num];
        for(int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(str.nextToken());
        }
        int find = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            if(find == a[i]) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
