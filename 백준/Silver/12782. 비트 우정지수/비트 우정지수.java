import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] N = st.nextToken().toCharArray();
            char[] M = st.nextToken().toCharArray();

            int count = 0;
            int diffZero = 0;
            int diffOne = 0;

            for (int i = 0; i < N.length; i++) {
                if (N[i] != M[i] && N[i] == '0') {
                    diffZero++;
                } else if (N[i] != M[i] && N[i] == '1') {
                    diffOne++;
                }
            }

            int move = Math.min(diffZero, diffOne);
            count += move;

            diffZero = diffZero - move;
            diffOne = diffOne - move;

            if (diffZero != 0) {
                count += diffZero;
            } else if (diffOne != 0) {
                count += diffOne;
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
