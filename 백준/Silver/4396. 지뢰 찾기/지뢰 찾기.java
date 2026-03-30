import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static final int[] ROW = {-1, -1, -1, 0, 0, 1, 1, 1};
    static final int[] COL = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        char[][] board = new char[n][n];
        char[][] playing = new char[n][n];
        char[][] answer = new char[n][n];

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            playing[i] = br.readLine().toCharArray();
        }

        boolean flag = false;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (playing[r][c] == 'x') {
                    if (board[r][c] == '*') flag = true;
                    int bomb = 0;
                    for (int k = 0; k < 8; k++) {
                        int row = r + ROW[k];
                        int col = c + COL[k];

                        if (row < 0 || row >= n || col < 0 || col >= n) continue;
                        if (board[row][col] == '*') {
                            bomb++;
                        }
                    }
                    answer[r][c] = (char) (bomb + '0');
                    continue;
                }
                answer[r][c] = '.';
            }
        }

        if (flag) {
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    if (board[r][c] == '*') {
                        answer[r][c] = '*';
                    }
                }
            }
        }

        for (char[] chars : answer) {
            sb.append(chars).append('\n');
        }

        System.out.println(sb);
    }
}

