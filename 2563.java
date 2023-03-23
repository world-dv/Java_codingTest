import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] black = new int[101][101];
        int count = 0;
        for(int i = 0; i < a; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start; j < start+10; j++){
                for(int z = end; z< end+10; z++){
                    if(black[j][z] == 0) {
                        count++;
                        black[j][z]++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}
