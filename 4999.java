import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String say = sc.next();
        String doct = sc.next();
        if(doct.contains(say) && doct.length() > say.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    } 
}
