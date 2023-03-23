import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            String answer = "";
            for(int j = 0; j < str.length(); j++) {
                char a = str.charAt(j);
                if(a == '(') {
                    stack.push(a);
                } else {
                    if(stack.empty()) {
                        answer = "NO";
                    } else {
                        stack.pop();   
                    }
                }
            }
            if(stack.empty()) {
                if(answer.equals("NO")) {
                    System.out.println(answer);
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }
} //stack 

/*
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int count = 0;
            String str = br.readLine();
            String answer = "";
            for(int j = 0; j < str.length(); j++) {
                char a = str.charAt(j);
                if(a == '(') {
                    count++;
                } else if (a == ')'){
                    if(count == 0) {
                        answer = "NO";
                    } else {
                        count--;
                    }
                }
            }
            if(count == 0) {
                if(answer.equals("NO")) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }
        }
        br.close();
    }
} //count
*/
