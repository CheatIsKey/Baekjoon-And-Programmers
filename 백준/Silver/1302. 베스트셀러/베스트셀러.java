import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int max = Collections.max(map.values());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            if (count == max) {
                sb.append(name);
                break;
            }
        }

        System.out.println(sb);
    }
}


