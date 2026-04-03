import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int[] count = new int[N + 1];
        Arrays.fill(count, 1);

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++) {
            int idx = Integer.parseInt(st.nextToken());
            count[idx]--;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int idx = Integer.parseInt(st.nextToken());
            count[idx]++;
        }

        for (int idx = 1; idx < count.length; idx++) {
            if (count[idx] == 2) {
                int prev = idx - 1;
                int next = idx + 1;

                if (prev > 0 && count[prev] == 0) {
                    count[prev]++;
                    count[idx]--;
                    continue;
                }
                if (next <= N && count[next] == 0) {
                    count[next]++;
                    count[idx]--;
                }
            }
        }

        int answer = 0;
        for (int i = 1; i < count.length; i++) {
            int idx = count[i];

            if (idx == 0) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}

