import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, sum = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 1) {
                sum += x + count;
                count++;
            } else {
                count = 0;
            }
        }
        System.out.println(sum);
    }
}
