import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1,1,2,2,2,8};
        for(int i = 0; i < 6; i++) {
            System.out.print(number[i] - sc.nextInt());
            if(i == 5) {
                break;
            } else {
                System.out.print(" ");
            }
        }
    }
}
