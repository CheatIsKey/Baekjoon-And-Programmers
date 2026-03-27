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

        char[] board = new char[N];
        boolean[] used = new boolean[32];
        int pos = 0;

        Arrays.fill(board, '?');

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            char word = st.nextToken().charAt(0);

            pos = (pos + S) % N;

            if (board[pos] != '?' && board[pos] != word) {
                System.out.println("!");
                return;
            }

            if (board[pos] == '?' && used[word - 'A']) {
                System.out.println("!");
                return;
            }

            board[pos] = word;
            used[word - 'A'] = true;
        }

        for (int i = 0; i < N; i++) {
            int idx = (pos - i + N) % N;
            sb.append(board[idx]);
        }

        System.out.println(sb);
    }
}

