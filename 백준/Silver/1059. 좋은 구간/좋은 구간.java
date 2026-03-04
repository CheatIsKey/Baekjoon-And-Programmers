import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int L = Integer.parseInt(br.readLine());

        int[] set = new int[L];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++) {
            set[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(set);

        int n = Integer.parseInt(br.readLine());

        int start = -1;
        int end = -1;

        if (n < set[0]) {
            start = 0;
            end = set[0];
        } else {
            for (int i = 0; i < set.length; i++) {
                if (set[i] == n) {
                    System.out.println(0);
                    return;
                }
                if (set[i] < n) {
                    start = set[i];
                    continue;
                }
                if (n < set[i]) {
                    end = set[i];
                    break;
                }
            }
        }

        int cnt = 0;

        for (int i = start + 1; i <= n; i++) {
            for (int j = n; j < end; j++) {
                if (i == j) continue;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}


