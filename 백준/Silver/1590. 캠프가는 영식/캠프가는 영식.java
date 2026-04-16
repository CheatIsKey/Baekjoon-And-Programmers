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
        long T = Long.parseLong(st.nextToken());

        long answer = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            long S = Long.parseLong(st.nextToken());
            long I = Long.parseLong(st.nextToken());
            long C = Long.parseLong(st.nextToken());

            long start = 0;
            long end = C - 1;
            long busTime = -1;

            while (start <= end) {
                long mid = (start + end) / 2;
                long time = S + (I * mid);

                if (time >= T) {
                    busTime = time;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (busTime != -1) {
                answer = Math.min(answer, busTime);
            }
        }

        if (answer != Long.MAX_VALUE) {
            System.out.println(answer - T);
        } else {
            System.out.println("-1");
        }
    }
}


