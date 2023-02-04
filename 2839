import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int i = 0;
        while(true) {
           if(n % 5 == 0) {
               answer = i + n / 5;
               break;
           } 
           n -= 3;
           i++;
           if(n < 0){
               answer = -1;
               break;
           }
        }
        System.out.println(answer);
    }
}
