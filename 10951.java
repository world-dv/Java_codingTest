import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        while(sc.hasNext()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}
