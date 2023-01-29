import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int num = h * 60 + m - 45;
        h = num / 60;
        m = num % 60;
        if(num < 0) {
            h += 23;
            m += 60;
        }
        System.out.print(h + " " + m);
    }
}
