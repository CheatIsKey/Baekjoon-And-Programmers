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
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println(1);
            return;
        }

        long[] scores = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Long.parseLong(st.nextToken());
        }

        if (N == P && newScore <= scores[N - 1]) {
            System.out.println(-1);
            return;
        }

        int rank = 1;
        for (int i = 0; i < N; i++) {
            if (scores[i] > newScore) {
                rank++;
            } else {
                break;
            }
        }

        System.out.println(rank);
    }
}


