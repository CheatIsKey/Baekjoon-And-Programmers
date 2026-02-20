import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String X = st.nextToken();
        String Y = st.nextToken();

        int canMove = Y.length() - X.length();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= canMove; i++) {
            int cnt = 0;

            for (int idx = 0; idx < X.length(); idx++) {
                if (X.charAt(idx) != Y.charAt(idx + i)) {
                    cnt++;
                }
            }

            if (cnt < min) {
                min = cnt;
            }
        }

        System.out.println(min);
    }
}


