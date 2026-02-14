import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int outlier = (int) Math.round(N * 0.15);

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        double sum = 0;

        for (int i = outlier; i < N - outlier; i++) {
            sum += numbers[i];
        }

        if (sum == 0) {
            System.out.println(sum);
            return;
        }

        int n = N - outlier * 2;

        long avg = Math.round(sum / n);

        System.out.println(avg);
    }
}


