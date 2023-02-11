import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        String s = Integer.toString(a * b * c);
        String[] arr = s.split("");
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++) {
            int x = Integer.parseInt(arr[i]);
            count[x]++;
        }
        for(int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
    }
}
