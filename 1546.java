import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double sum = 0, max = 0;
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            double a = Double.parseDouble(str.nextToken());
            sum += a;
            if(max < a) {
                max = a;
            }
        }
        br.close();
        System.out.println(((sum / max) * 100) / n);
    }
}
