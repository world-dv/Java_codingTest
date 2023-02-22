import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i <= n; i++) {
            arr[i] = i;
        }
        for(int z = 0; z < m; z++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            for(int k = i; k <= j; k++) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for(int i : arr) {
            if(i == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
