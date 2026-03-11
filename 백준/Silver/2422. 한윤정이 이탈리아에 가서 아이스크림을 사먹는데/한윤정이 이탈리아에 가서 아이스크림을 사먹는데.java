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

        boolean[][] iceCream = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int ice = Integer.parseInt(st.nextToken());
            int cream = Integer.parseInt(st.nextToken());

            iceCream[ice][cream] = true;
            iceCream[cream][ice] = true;
        }

        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (iceCream[i][j]) continue;

                for (int k = j + 1; k <= N; k++) {
                    if (!iceCream[i][k] && !iceCream[j][k]) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}


