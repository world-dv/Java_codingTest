import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int burger = 2000;
        int drink = 2000;
        for(int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            if(burger >= n) {
                burger = n;
            }
        }
        for(int i = 0; i < 2; i++) {
            int n = sc.nextInt();
            if(drink >= n) {
                drink = n;
            }
        }
        System.out.println(burger+drink-50);
    }
}
