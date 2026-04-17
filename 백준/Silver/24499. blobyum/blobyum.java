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
        int K = Integer.parseInt(st.nextToken());

        int[] pies = new int[N * 2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            pies[i] = num;
            pies[N + i] = num;
        }

        int sum = 0;

        for (int i = 0; i < K; i++) {
            sum += pies[i];
        }

        int answer = sum;

        for (int i = 0; i < N - 1; i++) {
            sum = sum - pies[i] + pies[i + K];
            answer = Math.max(answer, sum);
        }

        System.out.println(answer);
    }
}

