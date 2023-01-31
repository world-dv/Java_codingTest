import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] a = new boolean[43];
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            a[n % 42] = true;
        }
        int count = 0;
        for(int i = 0; i < 43; i++) {
            if(a[i] == true){
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }
}
