import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Map<String, Boolean> map = new HashMap<>();

        map.put("ChongChong", true);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String people1 = st.nextToken();
            String people2 = st.nextToken();

            if (map.getOrDefault(people1, false)) {
                map.put(people2, true);
            } else if (map.getOrDefault(people2, false)) {
                map.put(people1, true);
            }
        }

        int cnt = 0;

        for (Boolean value : map.values()) {
            if (value) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}


