import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double answer = 0;
        double gradeSum = 0;
        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            String score = st.nextToken();
            double sum = 0;
            if(score.equals("A+")){
                sum = 4.5;
            } else if(score.equals("A0")) {
                sum = 4.0;
            } else if(score.equals("B+")) {
                sum = 3.5;
            } else if(score.equals("B0")) {
                sum = 3.0;
            } else if(score.equals("C+")) {
                sum = 2.5;
            } else if(score.equals("C0")) {
                sum = 2.0;
            } else if(score.equals("D+")) {
                sum = 1.5;
            } else if(score.equals("D0")) {
                sum = 1.0;
            } else if(score.equals("P")) {
                continue;
            } else {
                sum = 0;
            }
            sum *= grade;
            answer += sum;
            gradeSum += grade;
        }
        System.out.printf("%.6f", answer / gradeSum);
        br.close();
    }
}
