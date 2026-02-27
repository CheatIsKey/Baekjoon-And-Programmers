import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] chars = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                chars[i][j] = str.charAt(j);
            }
        }

        char[] DNA = new char[M];
        int total = 0;

        for (int i = 0; i < M; i++) {
            int[] count = new int[26];

            for (int j = 0; j < N; j++) {
                count[chars[j][i] - 'A']++;
            }

            int maxCnt = -1;
            int idx = 0;

            for (int j = 0; j < count.length; j++) {
                if (maxCnt < count[j]) {
                    maxCnt = count[j];
                    idx = j;
                }
            }

            DNA[i] = (char) (idx + 'A');
            total += (N - maxCnt);
        }

        sb.append(DNA).append('\n').append(total);

        System.out.println(sb);
    }
}


