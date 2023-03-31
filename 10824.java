import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ab = sc.next() + sc.next();
        String cd = sc.next() + sc.next();
        System.out.println(Long.parseLong(ab) + Long.parseLong(cd));
    }
}
