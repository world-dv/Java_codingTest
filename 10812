import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++){
            arr[i] = i;
        }
        for(int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int mark = 1;
            int[] temp = new int[j - i + 2];
            for(int z = k; z <= j; z++) {
                temp[mark++] = arr[z];
            }
            for(int z = i; z < k; z++) {
                temp[mark++] = arr[z];
            }
            mark = 1;
            for(int z = i; z <= j; z++) {
                arr[z] = temp[mark++];
            }
        }
        for(int i : arr) {
            if(i == 0) continue;
            System.out.print(i + " ");
        }
    }
}
