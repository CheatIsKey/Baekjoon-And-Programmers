import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];
        char[] command = br.readLine().toCharArray();
        boolean[][] horizontal = new boolean[N][N];
        boolean[][] vertical = new boolean[N][N];

        int row = 0;
        int col = 0;

        for (int i = 0; i < command.length; i++) {
            int nr = row;
            int nc = col;

            if (command[i] == 'U') nr--;
            else if (command[i] == 'D') nr++;
            else if (command[i] == 'L') nc--;
            else if (command[i] == 'R') nc++;

            if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;

            if (command[i] == 'U' || command[i] == 'D') {
                vertical[row][col] = true;
                vertical[nr][nc] = true;
            } else {
                horizontal[row][col] = true;
                horizontal[nr][nc] = true;
            }

            row = nr;
            col = nc;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (vertical[i][j] && horizontal[i][j]) sb.append('+');
                else if (vertical[i][j]) sb.append('|');
                else if (horizontal[i][j]) sb.append('-');
                else sb.append('.');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
