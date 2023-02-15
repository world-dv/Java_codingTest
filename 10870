import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(f(n));
    }
    public static long f(long x) {
        if(x < 2) {
            return x;
        }
        return f(x-1) + f(x-2);
    }
}
