import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(br.readLine());

            char[] before;
            String s = br.readLine();
            before = s.toCharArray();

            char[] after;
            s = br.readLine();
            after = s.toCharArray();

            int wrongWhite = 0;
            int wrongBlack = 0;

            for (int i = 0; i < N; i++) {
                if (before[i] == after[i]) continue;
                if (before[i] == 'W') wrongWhite++;
                else wrongBlack++;
            }

            sb.append(Math.max(wrongWhite, wrongBlack)).append('\n');
        }

        System.out.println(sb);
    }
}



