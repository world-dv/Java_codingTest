import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            int r = (n % h) * 100;
            int c = n / h + 1;
            if(n % h == 0) {
                c = n / h;
                r = h * 100;
            }
            System.out.println(r + c);
        }
    }
}
