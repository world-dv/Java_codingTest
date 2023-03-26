import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                int n = sc.nextInt();
                if(j == 0) {
                    sum += (n * 3600);
                } else if (j == 1) {
                    sum += (n * 60);
                } else {
                    sum += n;
                }
            }
            for(int j = 0; j < 3; j++) {
                int n = sc.nextInt();
                if(j == 0) {
                    sum -= (n * 3600);
                } else if (j == 1) {
                    sum -= (n * 60);
                } else {
                    sum -= n;
                }
            }
            sum *= -1;
            int h = sum / 3600;
            int m = (sum % 3600) / 60;
            int s = (sum % 3600) % 60;
            System.out.println(h + " " + m + " " + s);
        }
    }
}
