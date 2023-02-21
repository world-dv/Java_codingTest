import java.util.*;
import java.io.*;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int a = n / 4;
        for(int i = 0; i < a; i++) {
            sb.append("long ");
        }
        if(n % 4 != 0) {
            sb.append("long ");
        }
        sb.append("int");
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
