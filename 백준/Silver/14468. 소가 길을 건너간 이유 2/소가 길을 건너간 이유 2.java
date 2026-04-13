import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] logs = br.readLine().toCharArray();
        int[][] cows = new int[26][2];

        for (int i = 0; i < 26; i++) {
            Arrays.fill(cows[i], -1);
        }

        for (int i = 0; i < 52; i++) {
            int idx = logs[i] - 'A';

            if (cows[idx][0] == -1) {
                cows[idx][0] = i;
            } else {
                cows[idx][1] = i;
            }
        }

        int count = 0;

        for (int i = 0; i < 26; i++) {
            int start = cows[i][0];
            int end = cows[i][1];
            boolean[] flags = new boolean[26];

            for (int s = start + 1; s < end; s++) {
                flags[logs[s] - 'A'] = !flags[logs[s] - 'A'];
            }

            for (int j = i + 1; j < 26; j++) {
                if (flags[j]) count++;
            }
        }

        System.out.println(count);
    }
}


