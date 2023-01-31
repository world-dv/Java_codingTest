import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_i = 0;
        int max = 0;
        for(int i = 1; i <= 9; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a > max) {
                max_i = i;
                max = a;
            }
        }
        br.close();
        System.out.println(max);
        System.out.println(max_i);
    }
}
