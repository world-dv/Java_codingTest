import java.io.*;

public class Main {
    static int count; //전역 변수 선언
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Main m = new Main();
        for(int i = 0; i < n; i++) {
            count = 0;
            String s = br.readLine();
            System.out.println(isPalindrome(s) + " " + count);
        }
        br.close();
    }
    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }
    public static int recursion(String s, int l, int r) {
        count++;
        if(l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
}
