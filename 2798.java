import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0, min = m;
        for(int i = 0; i < n - 2; i++) {
            int sum = 0;
            for(int j = 0; j < n - 1; j++) {
                for(int z = 0; z < n; z++) {
                    if(i != j && j != z && i != z && j < z) {
                        sum = arr[i] + arr[j] + arr[z];
                        if(sum > m) {
                            continue;
                        }
                        int w = sum - m < 0 ? -1 * (sum - m) : sum - m;
                        if(min >= w) {
                            min = w;
                            answer = sum;
                        }
                    }
                }
            }
        }
        br.close();
        System.out.println(answer);
    }
}
