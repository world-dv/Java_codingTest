import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr[] = {"c=","c-","dz=","d-","lj","nj", "s=", "z="};
        int count = 0;
        String input = sc.next();
        for(int i = 0; i < arr.length; i++) {
            if(input.contains(arr[i])) {
                input = input.replace(arr[i], "0");
            }
        }
        System.out.println(input.length());
    }
}
