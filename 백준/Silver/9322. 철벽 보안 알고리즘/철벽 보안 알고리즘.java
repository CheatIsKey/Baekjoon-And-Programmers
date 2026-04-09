import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());

            int[] number = new int[n];
            String[] answer = new String[n];
            Map<String, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                map.put(s, i);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                number[i] = map.get(s);
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                String s = st.nextToken();
                int idx = number[i];

                answer[idx] = s;
            }

            for (String s : answer) {
                sb.append(s).append(" ");
            }

            sb.append('\n');
        }

        System.out.println(sb);
    }
}

