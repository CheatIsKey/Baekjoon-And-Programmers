import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] graph;
    static Deque<Integer> queue = new ArrayDeque<>();
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        dfs(N, V);
        sb.append('\n');
        bfs(N, V);

        System.out.println(sb);
    }

    private static void dfs(int n, int v) {
        boolean[] visited = new boolean[n + 1];

        stack.push(v);

        while (!stack.isEmpty()) {
            int u = stack.pop();

            if (visited[u]) continue;
            else visited[u] = true;

            for (int i = n; i >= 1; i--) {
                if (graph[u][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }

            sb.append(u).append(" ");
        }
    }

    private static void bfs(int n, int v) {
        boolean[] visited = new boolean[n + 1];

        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int u = queue.pop();

            sb.append(u).append(" ");

            for (int i = 1; i <= n; i++) {
                if (graph[u][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}