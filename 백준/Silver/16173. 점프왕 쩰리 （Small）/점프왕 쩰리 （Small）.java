import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] area = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][N];

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] polled = queue.poll();
            int r = polled[0];
            int c = polled[1];

            if (r < N && c < N) {
                if (area[r][c] == -1) {
                    System.out.println("HaruHaru");
                    return;
                }
            }

            int moveCnt = area[r][c];
            if (moveCnt == 0) continue;

            if (r + moveCnt < N && !visited[r + moveCnt][c]) {
                visited[r + moveCnt][c] = true;
                queue.add(new int[]{r + moveCnt, c});
            }

            if (c + moveCnt < N && !visited[r][c + moveCnt]) {
                visited[r][c + moveCnt] = true;
                queue.add(new int[]{r, c + moveCnt});
            }
        }

        System.out.println("Hing");
    }
}


