import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] curPos = {0, 0};
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1,  0, -1};
        int direction = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String commend = st.nextToken();
            int number = Integer.parseInt(st.nextToken());

            if (commend.equals("MOVE")) {
                curPos[0] += dx[direction] * number;
                curPos[1] += dy[direction] * number;

                if (curPos[0] < 0 || curPos[0] > M || curPos[1] < 0 || curPos[1] > M) {
                    System.out.println(-1);
                    return;
                }
            } else if (commend.equals("TURN")) {
                switch (number) {
                    case 0 -> direction = (direction + 1) % 4;
                    case 1 -> direction = ((direction + 4) - 1) % 4;
                }
            }
        }

        System.out.println(curPos[0] + " " + curPos[1]);
    }
}

