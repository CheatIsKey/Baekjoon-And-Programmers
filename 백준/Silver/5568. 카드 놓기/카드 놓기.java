import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, k;
    static boolean[] visited;
    static int[] card;
    static HashSet<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        visited = new boolean[n];
        card = new int[n];

        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, "");

        System.out.println(set.size());
    }

    private static void dfs(int depth, String number) {
        if (depth == k) {
            set.add(number);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;

                dfs(depth + 1, number + card[i]);

                visited[i] = false;
            }
        }
    }
}


