import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> posX = new HashMap<>();
        Map<Integer, Integer> posY = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            posX.put(x, posX.getOrDefault(x, 0) + 1);
            posY.put(y, posY.getOrDefault(y, 0) + 1);
        }

        int answer = 0;

        for (int value : posX.values()) {
            if (value > 1) {
                answer++;
            }
        }

        for (int value : posY.values()) {
            if (value > 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}

