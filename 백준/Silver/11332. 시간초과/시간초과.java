import java.io.*;
import java.util.*;

public class Main {
    static final long LIMIT = 100_000_000L;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        while (C-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            long N = Long.parseLong(st.nextToken());
            long T = Long.parseLong(st.nextToken());
            long L = Long.parseLong(st.nextToken());

            long maxOps = L * LIMIT;
            boolean isTLE = false;

            if (S.equals("O(N)")) {
                if (N * T > maxOps) isTLE = true;
            }
            else if (S.equals("O(N^2)")) {
                if (N >= 31623) isTLE = true;
                else if (N * N * T > maxOps) isTLE = true;
            }
            else if (S.equals("O(N^3)")) {
                if (N >= 1001) isTLE = true;
                else if (N * N * N * T > maxOps) isTLE = true;
            }
            else if (S.equals("O(2^N)")) {
                if (N >= 30) isTLE = true;
                else if ((1L << N) * T > maxOps) isTLE = true;
            }
            else if (S.equals("O(N!)")) {
                if (N >= 13) isTLE = true;
                else {
                    long res = 1;
                    for (int i = 1; i <= N; i++) res *= i;
                    if (res * T > maxOps) isTLE = true;
                }
            }

            System.out.println(isTLE ? "TLE!" : "May Pass.");
        }
    }
}