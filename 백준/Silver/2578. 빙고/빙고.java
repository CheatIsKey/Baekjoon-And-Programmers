import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[][] visited = new boolean[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Map<Integer, int[]> map = new HashMap<>();

        for (int r = 0; r < 5; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 5; c++) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, new int[]{r, c});
            }
        }

        int answer = 0;

        for (int r = 0; r < 5; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 5; c++) {
                int num = Integer.parseInt(st.nextToken());
                int[] ok = map.get(num);
                answer++;

                visited[ok[0]][ok[1]] = true;
                if (countBingo() >= 3) {
                    System.out.println(answer);
                    return;
                }
            }
        }
    }

    private static int countBingo() {
        int count = 0;

        for (int r = 0; r < 5; r++) {
            int temp = 0;
            for (int c = 0; c < 5; c++) {
                if (visited[r][c]) temp++;
            }

            if (temp == 5) count++;
        }

        for (int r = 0; r < 5; r++) {
            int temp = 0;
            for (int c = 0; c < 5; c++) {
                if (visited[c][r]) temp++;
            }

            if (temp == 5) count++;
        }

        int temp = 0;
        for (int idx = 0; idx < 5; idx++) {
            if (visited[idx][idx]) temp++;
        }
        if (temp == 5) count++;

        temp = 0;
        for (int idx = 0; idx < 5; idx++) {
            if (visited[idx][4 - idx]) temp++;
        }
        if (temp == 5) count++;

        return count;
    }
}


