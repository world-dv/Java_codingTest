import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        for(int i = 1; i < n; i++) {
            sum += sc.nextInt() - 1;
        }
        System.out.println(sum);
    }
}
