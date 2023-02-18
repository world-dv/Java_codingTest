import java.lang.StringBuilder;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true) {
            Integer[] arr = new Integer[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            Arrays.sort(arr, Collections.reverseOrder());
            double answer = Math.pow(arr[0], 2) - Math.pow(arr[1], 2) - Math.pow(arr[2], 2);
            if(answer == 0) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.print(sb);
    }
}
