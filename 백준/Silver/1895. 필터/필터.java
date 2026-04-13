import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static final int[] ROW = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
    static final int[] COL = {-1, 0, 1, -1, 0, 1, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[][] pixel = new int[R][C];

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < C; j++) {
                pixel[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int T = Integer.parseInt(br.readLine());

        int[] numbers = new int[9];
        int count = 0;

        for (int r = 1; r < R - 1; r++) {
            for (int c = 1; c < C - 1; c++) {

                for (int k = 0; k < 9; k++) {
                    numbers[k] = pixel[r + ROW[k]][c + COL[k]];
                }

                Arrays.sort(numbers);

                if (numbers[4] >= T) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


