import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] numbers = new int[N];
            int[] dp = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }

            dp[0] = numbers[0];
            int max = dp[0];

            for (int i = 1; i < N; i++) {
                dp[i] = Math.max(numbers[i], dp[i - 1] + numbers[i]);

                if (dp[i] > max) {
                    max = dp[i];
                }
            }

            sb.append(max).append('\n');
        }

        System.out.println(sb);
    }
}


