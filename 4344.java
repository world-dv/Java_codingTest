import java.io.*;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine(), " ");
            int number = Integer.parseInt(str.nextToken());
            double[] arr = new double[number];
            double sum = 0;
            for(int j = 0; j < number; j++){
                double a = Double.parseDouble(str.nextToken());
                arr[j] = a;
                sum += arr[j];
            }
            double avg = sum / number;
            double count = 0;
            for(int j = 0; j < number; j++) {
                if(avg < arr[j]){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count / number) * 100);
        }
        br.close();
    }
}
