import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long W = Long.parseLong(st.nextToken());

        long coin = 0;

        long cur = Long.parseLong(br.readLine());

        for (int i = 0; i < n - 1; i++) {
            long next = Long.parseLong(br.readLine());

            if (cur < next) {
                coin += W / cur;
                W %= cur;
            } else if (coin > 0 && cur > next) {
                W += coin * cur;
                coin = 0;
            }

            cur = next;
        }

        if (coin > 0) {
            W += coin * cur;
        }

        System.out.println(W);
    }
}

