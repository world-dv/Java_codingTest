import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                s = s.substring(0, 0) + (Character.toString(s.charAt(0) - 32)) + s.substring(1);
            }
            System.out.println(s);
        }
        br.close();
    }
}
