import java.io.*;
import java.util.*;

class Main {
    static final int[] ROW = {-1, 0, 0, 1};
    static final int[] COL = {0, -1, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) board[i] = br.readLine().trim().toCharArray();

        int[][] dist = new int[N][M];
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{0, 0});
        dist[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int row = cur[0], col = cur[1];

            for (int i = 0; i < 4; i++) {
                int dr = row + ROW[i];
                int dc = col + COL[i];

                if (dr < 0 || dr >= N || dc < 0 || dc >= M) continue;
                if (board[dr][dc] == '0') continue;
                if (dist[dr][dc] != 0) continue;

                dist[dr][dc] = dist[row][col] + 1;
                queue.add(new int[]{dr, dc});
            }
        }

        System.out.println(dist[N - 1][M - 1]);
    }
}