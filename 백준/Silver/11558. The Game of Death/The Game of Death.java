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

            int[] toMember = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                toMember[i] = Integer.parseInt(br.readLine());
            }

            boolean[] visited = new boolean[N + 1];
            int cur = 1;
            int move = 0;

            while (true) {
                int x = toMember[cur];
                move++;

                if (visited[x]) {
                    sb.append(0).append('\n');
                    break;
                }

                if (x == N) {
                    sb.append(move).append('\n');
                    break;
                }

                cur = x;
                visited[cur] = true;
            }
        }

        System.out.println(sb);
    }
}

