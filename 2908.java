import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        String a = str.nextToken();
        String b = str.nextToken();
        StringBuilder a_t = new StringBuilder("");
        StringBuilder b_t = new StringBuilder("");
        for(int i = 2; i >= 0; i--){
            a_t.append(a.charAt(i));
            b_t.append(b.charAt(i));
        }
        br.close();
        if(Integer.parseInt(a_t.toString()) > Integer.parseInt(b_t.toString())){
            System.out.println(Integer.parseInt(a_t.toString()));
        } else {
            System.out.println(Integer.parseInt(b_t.toString()));
        }
    }
}
