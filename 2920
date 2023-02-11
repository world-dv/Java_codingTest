import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0; i < 8; i++){
            arr[i] = sc.nextInt();
        }
        char count = 'x';
        for(int i = 0; i < 7; i++){
            if(arr[i] - arr[i+1] == 1) {
                count = 'd';
            } else if (arr[i] - arr[i+1] == -1) {
                count = 'a';
            } else {
                count = 'm';
                break;
            }
        }
        if(count == 'a') {
                System.out.println("ascending");
        } else if (count == 'd') {
                System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
