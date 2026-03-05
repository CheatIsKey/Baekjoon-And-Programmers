import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int length = 4 * (N - 1) + 1;

        char[][] field = new char[length][length];

        for (int i = 0; i < length; i++) {
            Arrays.fill(field[i], ' ');
        }

        star(field, 0, 0, length);

        for (char[] row : field) {
            sb.append(row).append('\n');
        }

        System.out.println(sb);
    }

    private static void star(char[][] field, int row, int col, int length) {
        if (length <= 0) return;

        int right = col + length - 1;
        int down = row + length - 1;

        for (int i = 0; i < length; i++) {
            field[row][col + i] = '*';
            field[down][col + i] = '*';
            field[row + i][col] = '*';
            field[row + i][right] = '*';
        }

        if (length > 1) {
            star(field, row + 2, col + 2, length - 4);
        }
    }
}


