import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toUpperCase();
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'A']+=1;
        }
        int max = -1;
        char answer = '?';
        for(int i = 0; i < 26; i++){
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i + 'A');
            } else if(max == arr[i]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}
