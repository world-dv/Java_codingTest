import java.lang.StringBuilder;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[][] arr = new char[5][15];
        int max = 0;
        for(int i = 0; i < 5; i++) {
            String st = br.readLine();
            int len = st.length();
            if(max < len) {
                max = len;
            }
            for(int j = 0; j < len; j++) {
                arr[i][j] = st.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] != 0) {
                    sb.append(arr[j][i]);   
                } //char은 원시타입이라 null 사용 X
            }
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
