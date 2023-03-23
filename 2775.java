import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] sum = new int[15][15];
        
        for(int i = 0; i < 15; i++){
            sum[i][1] = 1;
            sum[0][i] = i;
            sum[1][i] = (i * (i+1)) / 2;
            sum[2][i] = (i * (i+1) * (i+2)) / 6;
        }
        for(int i = 3; i < 15; i++){
            for(int j = 2; j < 15; j++) {
                sum[i][j] = sum[i][j-1] + sum[i - 1][j];
            }
        }
        
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(sum[a][b]);
        }
    }
}
