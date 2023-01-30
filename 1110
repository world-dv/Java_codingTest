import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n, count = 0;
        while(true){
            n = ((n / 10 + n % 10) % 10) + ((n % 10) * 10);
            count++;
            if(a == n) {
                break;
            }
        }
        System.out.print(count);
    }
}
