import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int markX = 1;
        int markY = 1;
        int y2 = 0, x2 = 0;
        for(int i = 0; i < 2; i++) {
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            if(x == x3) {
                markX++;
            } else {
                x2 = x3;
            }
            if(y == y3) {
                markY++;
            } else {
                y2 = y3;
            }
        }
        int answerX = 0;
        int answerY = 0;
        if(markX == 2) {
            answerX = x2;
        } else {
            answerX = x;
        }
        if(markY == 2) {
            answerY = y2;
        } else {
            answerY = y;
        }
        System.out.println(answerX + " " + answerY);
    }
}
