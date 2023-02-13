import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[123456*2+1];
        arr[1]++;
        for(int i = 2; i <= 123456; i++){
            for(int j = 2; j * i <= 123456 * 2; j++) {
                arr[j * i]++;
            }
        }
        while(true){
            int count = 0;
            int x = sc.nextInt();
            if(x == 0) {
                break;
            }
            for(int i = x + 1; i <= x * 2; i++) {
                if(arr[i] < 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
