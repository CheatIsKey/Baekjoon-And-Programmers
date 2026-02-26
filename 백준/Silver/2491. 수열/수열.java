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

        int[] increase = new int[N];
        int[] decrease = new int[N];

        Arrays.fill(increase, 1);
        Arrays.fill(decrease, 1);

        st = new StringTokenizer(br.readLine());

        int prev = Integer.parseInt(st.nextToken());
        int answer = 1;

        for (int i = 1; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());

            if (prev <= number) {
                increase[i] = increase[i - 1] + 1;
            } else {
                increase[i] = 1;
            }

            if (prev >= number) {
                decrease[i] = decrease[i - 1] + 1;
            } else {
                decrease[i] = 1;
            }

            prev = number;
            answer = Math.max(answer, Math.max(increase[i], decrease[i]));
        }

        System.out.println(answer);
    }
}


