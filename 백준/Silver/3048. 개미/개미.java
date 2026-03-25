import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        Ant[] ants = new Ant[N1 + N2];

        String s = br.readLine();
        for (int i = 0; i < N1; i++) {
            ants[N1 - 1 - i] = new Ant(s.charAt(i), 1);
        }

        s = br.readLine();
        for (int i = 0; i < N2; i++) {
            ants[N1 + i] = new Ant(s.charAt(i), -1);
        }

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            boolean[] moved = new boolean[ants.length];

            for (int i = 0; i < ants.length - 1; i++) {
                if (ants[i].direction == 1 && ants[i + 1].direction == -1) {
                    if (!moved[i] && !moved[i + 1]) {
                        Ant ant = ants[i];
                        ants[i] = ants[i + 1];
                        ants[i + 1] = ant;

                        moved[i] = true;
                        moved[i + 1] = true;
                    }
                }
            }

        }

        for (Ant ant : ants) sb.append(ant.info);

        System.out.println(sb);
    }

    public static class Ant {
        private final char info;
        private final int direction;

        private Ant(char info, int direction) {
            this.info = info;
            this.direction = direction;
        }
    }
}



