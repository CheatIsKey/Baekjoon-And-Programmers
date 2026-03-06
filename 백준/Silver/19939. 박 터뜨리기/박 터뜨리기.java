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
        int K = Integer.parseInt(st.nextToken());

        if (N < (K * (K + 1) / 2)) {
            System.out.println(-1);
            return;
        }

        int R = N - ((K * (K + 1) / 2));

        if (R % K == 0) {
            System.out.println(K - 1);
            return;
        }

        System.out.println(K);
    }
}


