import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.print(count(a));
    }
    public static int count(int a){
        int x = 0, y = 0, z = 0, count = 99;
        if(a < 100) {
            return a;
        } else {
            for(int i = 100; i <= a; i++){
                x = i / 100;
                y = (i / 10) % 10;
                z = i % 10;
                if((x - y) == (y - z)) {
                    count++;
                }
            }
        }
        return count;
    }
}
