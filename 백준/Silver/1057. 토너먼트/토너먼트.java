import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int player = N;
        int round = 1;

        while (true) {
            int[] battle;

            if (player == 1) break;
            if (player % 2 == 0) {
                battle = new int[player + 1];
                for (int i = 1; i <= player; i++) {
                    battle[i] = (i - 1) / 2 + 1;
                }
                player /= 2;
            } else {
                battle = new int[player + 1];
                for (int i = 1; i <= player; i++) {
                    battle[i] = (i - 1) / 2 + 1;
                }
                player = player / 2 + 1;
            }
            if (battle[J] == battle[H]) {
                sb.append(round);
                break;
            } else {
                J = battle[J];
                H = battle[H];
                round++;
            }
        }

        System.out.println(sb);
    }
}


