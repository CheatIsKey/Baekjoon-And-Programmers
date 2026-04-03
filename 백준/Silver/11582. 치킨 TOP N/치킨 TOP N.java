import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] scores = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int isNum = Integer.parseInt(br.readLine());
        int group = N / isNum;

        for (int i = 0; i < N; i += group) {
            Arrays.sort(scores, i, group + i);
        }

        for (int score : scores) {
            sb.append(score).append(" ");
        }

        System.out.println(sb);
    }
}

