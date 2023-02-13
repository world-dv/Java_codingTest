import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000+1];
        arr[1]++;
        for(int i = 2; i <= 10000; i++) {
            for(int j = 2; i *j <= 10000; j++) {
                arr[i*j]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int left = x / 2;
            int right = x / 2;
            while(true) {
                if(arr[left] < 1 && arr[right] < 1) {
                sb.append(left + " " + right + "\n");
                    break;
                } else {
                    left--;
                    right++;
                }
            }
        }
        System.out.println(sb);
    }
}
