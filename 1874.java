import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        int i = 1, j = 1;
        while(true) {
            if(i > n) {
                break;
            }
            if(arr[i] >= j) {
                stack.push(j);
                sb.append("+\n");
                j++;
                continue;
            }
            if(arr[i] == stack.peek()) {
                stack.pop();
                sb.append("-\n");
                i++;
            } else {
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
        }
        System.out.println(sb);
    }
}
