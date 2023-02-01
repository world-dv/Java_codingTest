import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String arr = br.readLine();
            int sum = 0;
            int count = 0;
            for(int j = 0; j < arr.length(); j++) {
                if(arr.charAt(j) == 'O'){
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}
