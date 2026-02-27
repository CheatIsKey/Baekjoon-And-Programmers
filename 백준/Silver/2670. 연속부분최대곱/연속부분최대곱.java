import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        double[] input = new double[N];

        for (int i = 0; i < N; i++) {
            input[i] = Double.parseDouble(br.readLine());
        }

        double[] dp = new double[N];
        dp[0] = input[0];
        double max = dp[0];

        for (int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i - 1] * input[i], input[i]);
            max = Math.max(max, dp[i]);
        }

        System.out.printf("%.3f", max);
    }
}


