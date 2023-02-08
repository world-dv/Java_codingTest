import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        long[] result = new long[m];
        long answer = 0;
        arr[0] = sc.nextInt();
        int zero = (int)(arr[0] % m);
        answer += zero == 0 ? 1 : 0;
        result[zero]++;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + sc.nextInt();
            int x = (int)(arr[i] % m);
            answer += x == 0 ? 1 : 0;
            result[x]++;
        }
        for(int i = 0; i < m; i++){
            if(result[i] > 1) {
                answer += ((result[i] * (result[i] - 1)) / 2);
            }
        }
        System.out.println(answer);
    }
}
