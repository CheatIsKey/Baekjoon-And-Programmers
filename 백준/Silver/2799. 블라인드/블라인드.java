import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int row = 5 * M + 1;
        int col = 5 * N + 1;

        char[][] apt = new char[row][col];
        int[] answer = new int[5];

        for (int i = 0; i < row; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            for (int j = 0; j < col; j++) {
                apt[i][j] = s.charAt(j);
            }
        }

        for (int i = 1; i < row; i += 5) {
            for (int j = 1; j < col; j += 5) {
                int cnt = 0;

                for (int k = 0; k < 4; k++) {
                    if (apt[i + k][j] == '*') cnt++;
                    else break;
                }

                answer[cnt]++;
            }
        }

        for (int i : answer) {
            sb.append(i).append(" ");
        }

        System.out.println(sb);
    }
}


