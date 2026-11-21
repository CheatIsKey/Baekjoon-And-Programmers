import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int computers = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine());

        int[][] board = new int[computers + 1][computers + 1];

        for (int i = 0; i < edges; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            board[from][to] = 1;
            board[to][from] = 1;
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[computers + 1];
        int cnt = 0;

        stack.push(1);

        while (!stack.isEmpty()) {
            int computer = stack.pop();

            if (visited[computer]) continue;
            visited[computer] = true;

            for (int i = 1; i <= computers; i++) {
                if (board[computer][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }

            cnt++;
        }

        System.out.println(cnt - 1);
    }
}