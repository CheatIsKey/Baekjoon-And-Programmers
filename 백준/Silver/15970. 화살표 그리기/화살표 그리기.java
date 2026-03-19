import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Integer>[] colors = new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            colors[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            colors[y].add(x);
        }

        for (int i = 0; i <= N; i++) {
            if (colors[i].size() < 2) continue;
            colors[i].sort(Comparator.comparing(Integer::intValue));
        }

        int answer = 0;

        for (List<Integer> color : colors) {
            if (color.size() < 2) continue;

            for (int i = 0; i < color.size(); i++) {
                if (i == 0) {
                    answer += color.get(i + 1) - color.get(i);
                } else if (i == color.size() - 1) {
                    answer += Math.abs(color.get(i - 1) - color.get(i));
                } else {
                    answer += Math.min(Math.abs(color.get(i - 1) - color.get(i)), color.get(i + 1) - color.get(i));
                }
            }
        }

        System.out.println(answer);
    }
}


