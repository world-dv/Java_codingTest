import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            num -= (sc.nextInt() * sc.nextInt());
        }
        if(num == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
