import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalRows = 2 * N - 1;
        int totalCols = 4 * N - 3;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalRows; i++) {
            char[] line = new char[totalCols];
            Arrays.fill(line, ' ');

            if (i == 0 || i == 2 * N - 2) {
                for (int j = 0; j < N; j++)
                    line[j] = '*';
                for (int j = 3 * N - 3; j <= 4 * N - 4; j++)
                    line[j] = '*';
            } else {
                int r = Math.min(i, 2 * N - 2 - i);
                line[r] = '*';
                line[r + N - 1] = '*';
                line[3 * N - 3 - r] = '*';
                line[4 * N - 4 - r] = '*';
            }

            int last = totalCols - 1;
            while (last >= 0 && line[last] == ' ') last--;
            sb.append(new String(line, 0, last + 1)).append('\n');
        }

        System.out.print(sb);
    }
}