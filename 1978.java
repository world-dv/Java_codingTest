import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(count(x)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    public static boolean count(int x) {
        if(x == 1){
            return false;
        }
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
