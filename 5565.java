import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            int x = sc.nextInt();
            sum += x;
        }
        System.out.println(n - sum);
    }
}
