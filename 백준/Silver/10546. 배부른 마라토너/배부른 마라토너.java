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

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 2 * N - 1; i++) {
            String runner = br.readLine();
            map.put(runner, map.getOrDefault(runner, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String runner = entry.getKey();
            int count = entry.getValue();

            if (count % 2 != 0) {
                System.out.println(runner);
                return;
            }
        }
    }
}



