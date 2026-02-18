import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            List<Integer>[] list = new ArrayList[N + 1];
            for (int j = 1; j <= N; j++) {
                list[j] = new ArrayList<>();
            }

            for (int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                int plane1 = Integer.parseInt(st.nextToken());
                int plane2 = Integer.parseInt(st.nextToken());

                list[plane1].add(plane2);
                list[plane2].add(plane1);
            }

            Queue<Integer> queue = new LinkedList<>();
            int[] visited = new int[N + 1];

            int cnt = 0;
            queue.add(1);
            visited[1] = 1;

            while (!queue.isEmpty()) {
                int polled = queue.poll();

                for (int next : list[polled]) {
                    if (visited[next] == 0) {
                        visited[next] = 1;
                        queue.add(next);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}


