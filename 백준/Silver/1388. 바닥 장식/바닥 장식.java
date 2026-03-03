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
        int M = Integer.parseInt(st.nextToken());

        char[][] floor = new char[N][M];

        for (int r = 0; r < N; r++) {
            floor[r] = br.readLine().toCharArray();
        }

        int cnt = 0;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (floor[r][c] == '-') {
                    if (c == M - 1 || floor[r][c + 1] == '|') {
                        cnt++;
                    }
                } else {
                    if (r == N - 1 || floor[r + 1][c] == '-') {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}


