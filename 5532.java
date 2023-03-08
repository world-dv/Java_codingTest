import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int a1 = A / C + (A % C > 0 ? 1 : 0);
        int a2 = B / D + (B % D > 0 ? 1 : 0);
        int sum = a1 > a2 ? a1 : a2;
        System.out.println(L - sum);
    }
}
