import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(true) {
            x = sc.nextLine();
            if(x.equals(".")) {
                break;
            }
            String answer = "";
            stack.clear();
            for (int i = 0; i < x.length(); i++) {
                char s = x.charAt(i);
                if (s == '(' || s == '[') {
                    stack.push(s);
                } else {
                    if (s == ')') {
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                        } else {
                            answer = "no";
                            break;
                        }
                    } else if (s == ']') {
                        if (!stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            answer = "no";
                            break;
                        }
                    }
                }
            }
            if (stack.isEmpty() && answer != "no") {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.print(sb);
    }
}
