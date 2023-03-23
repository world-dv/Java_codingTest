import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int[] max_index = new int[2];
        for(int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++){
                int a = Integer.parseInt(st.nextToken());
                if(max < a) {
                    max = a;
                    max_index[0] = i;
                    max_index[1] = j;
                }
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(max_index[0] + " " + max_index[1]);
    }
}
