import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        for(int i = 0; i < n ; i++){
            String s = sc.next();
            boolean[] ch = new boolean[26];
            for(int j = 0; j < s.length() - 1; j++){
                int a = s.charAt(j) - 97;
                if(s.charAt(j) != s.charAt(j+1)){
                    if(ch[s.charAt(j+1) - 97]){
                        count--;
                        break;
                    }
                }
                ch[a] = true;
            }
        }
        System.out.print(count);
    }
}
