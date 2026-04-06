import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] scores = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                scores[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;

        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M; j++) {
                for (int k = j + 1; k < M; k++) {
                    int sum = 0;

                    for (int idx = 0; idx < N; idx++) {
                        int scoreOne = scores[idx][i];
                        int scoreTwo = scores[idx][j];
                        int scoreThree = scores[idx][k];

                        sum += Math.max(scoreOne, Math.max(scoreTwo, scoreThree));
                    }

                    max = Math.max(sum, max);
                }
            }
        }

        System.out.println(max);
    }
}

