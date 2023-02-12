import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0, count = 0, min = 0;
        for(int i = m; i <= n; i++) {
            if(number(i)){
                sum += i;
                if(count == 0) {
                    min = i;
                    count++;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    public static boolean number(int x){
        if(x == 1){
            return false;
        } 
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
