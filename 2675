import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int count = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j = 0; j < s.length(); j++){
                for(int z = 0; z < count; z++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print("\n");
        }
        br.close();
    }
}
