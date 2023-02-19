import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[1001];
        int sum = 0;
        int count = 1;
        for(int i = 1; i <= 1000; i++) {
            for(int j = 0; j < i; j++) {
                if(count > 1000) {
                    break;
                }
                arr[count] = i;
                count++;
            }
        }
        for(int i = a; i <= b; i++) {
            sum += arr[i];
        }
        bw.write(sum + "");
        br.close();
        bw.close();
    }
}
