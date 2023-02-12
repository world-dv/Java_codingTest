import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String in = st.nextToken();
            if(in.equals("push")) {
                int a = Integer.parseInt(st.nextToken());
                stack.push(a);
            } else if(in.equals("top")) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if(in.equals("size")) {
                System.out.println(stack.size());
            } else if(in.equals("pop")) {
                if(stack.empty()) {
                    System.out.println(-1);
                } else {
                    int b = stack.pop();
                    System.out.println(b);
                }
            } else if(in.equals("empty")) {
                if(stack.empty()){
                    System.out.println(1);
                } else{
                    System.out.println(0);
                }
            }
        }
        br.close();
    }
}
