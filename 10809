import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int length = s.length();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i = 0; i < length; i++){
            int a = s.charAt(i) - 97;
            if(arr[a] == -1) {
                arr[a] = i;
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
