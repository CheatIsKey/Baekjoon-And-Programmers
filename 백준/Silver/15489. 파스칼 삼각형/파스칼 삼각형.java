import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[][] triangle = new int[31][31];

        for (int r = 1; r < 31; r++) {
            for (int c = 1; c < r + 1; c++) {
                if (c == 1 || c == r) {
                    triangle[r][c] = 1;
                } else {
                    triangle[r][c] = triangle[r - 1][c - 1] + triangle[r - 1][c];
                }
            }
        }

        int sum = 0;

        for (int r = 0; r < W; r++) {
            for (int c = 0; c < r + 1; c++) {
                sum += triangle[R + r][C + c];
            }
        }

        System.out.println(sum);
    }
}

