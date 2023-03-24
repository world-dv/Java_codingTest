import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 101, sum = 0;
        for(int i = 0; i < 7; i++) {
            int x = sc.nextInt();
            if(x % 2 != 0) {
                sum += x;
                if(x < min) {
                    min = x;
                }
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
        if(min == 101) {

        } else {
            System.out.println(min);
        }
    }
}
