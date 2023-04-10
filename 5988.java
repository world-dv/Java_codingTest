import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            BigInteger m = sc.nextBigInteger();
            if(m.mod(BigInteger.TWO) == BigInteger.ZERO) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
