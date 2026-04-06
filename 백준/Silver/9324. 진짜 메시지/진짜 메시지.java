import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < testcase; tc++) {
            int[] counts = new int[26];
            boolean flag = true;

            String word = br.readLine();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                counts[c - 'A']++;

                if (counts[c - 'A'] == 3) {
                    if ((i + 1) >= word.length() || word.charAt(i + 1) != c) {
                        sb.append("FAKE").append('\n');
                        flag = false;
                        break;
                    }

                    i++;
                    counts[c - 'A'] = 0;
                }
            }

            if (flag) sb.append("OK").append('\n');
        }

        System.out.println(sb);
    }
}

