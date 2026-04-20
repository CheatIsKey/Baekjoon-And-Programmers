import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long min = Long.MAX_VALUE;
        long maxSub = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            long K = Long.parseLong(st.nextToken());

            min = Math.min(K, min);

            long sub = K - min;
            maxSub = Math.max(maxSub, sub);

            sb.append(maxSub).append(' ');
        }

        System.out.println(sb);
    }
}

