import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1){
            System.out.println(1);
        } else {
            int answer = 1;
            int b = 1;
            while(true){
                b = b + 6 * answer;
                answer++;
                if(b >= a){
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
