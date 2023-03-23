import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] names = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int sum = y;
        for(int i = 1; i < x; i++) {
            sum += days[i];
        }
        bw.write(names[sum % 7]);
        bw.close();
        br.close();
    }
}
