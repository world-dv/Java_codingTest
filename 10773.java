import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++) {
            int input = sc.nextInt();
            if(input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        int sum = 0; 
        while(!stack.isEmpty()){
            sum += stack.peek();
            stack.pop();
        }
        System.out.println(sum);
    }
}
