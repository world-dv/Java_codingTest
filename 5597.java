import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] a = new boolean[31];
        for(int i = 0; i < 28; i++){
            int n = Integer.parseInt(br.readLine());
            a[n] = true;
        }
        int count = 0;
        int[] b = new int[2];
        for(int i = 1; i <= 30; i++){
            if(a[i] == false){
                b[count] = i;
                count++;
            }
            if(count > 1){
                break;
            }
        }
        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
