import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] sorted = new int[n+1];
        merge_sort(arr, 0, n - 1, sorted);
        for(int i : arr) {
            bw.write(i + "");
            bw.write("\n");
        }
        br.close();
        bw.close();
    }

    public static void merge_sort(int[] arr, int left, int right, int[] sorted) {
        if (left < right) {
            int mid = (left + right) / 2;
            merge_sort(arr, left, mid, sorted);
            merge_sort(arr,mid + 1, right, sorted);
            merge(arr, left, mid, right,sorted);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right, int[] sorted) {
        int leftI = left;
        int rightI = mid + 1;
        int sortedI = left;

        while(leftI <= mid && rightI <= right) {
            if(arr[leftI] < arr[rightI]) {
                sorted[sortedI] = arr[leftI];
                leftI++;
            } else {
                sorted[sortedI] = arr[rightI];
                rightI++;
            }
            sortedI++;
        }
        if(leftI > mid) {
            for(int i = rightI; i <= right; i++) {
                sorted[sortedI] = arr[i];
                sortedI++;
            }
        } else {
            for(int i = leftI; i <= mid; i++) {
                sorted[sortedI] = arr[i];
                sortedI++;
            }
        }
        for(int i = left; i <= right; i++) {
            arr[i] = sorted[i];
        }
    }
}
