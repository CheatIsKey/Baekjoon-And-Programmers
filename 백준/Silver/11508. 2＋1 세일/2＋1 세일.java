import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(br.readLine());
        }

        long total = 0;
        
        if (prices.length < 3) {
            for (int price : prices) {
                total += price;
            }

            System.out.println(total);
            return;
        }
        
        Arrays.sort(prices);

        int cnt = 0;

        for (int idx = N - 1; idx >= 0; idx--) {
            if (cnt == 2) {
                cnt = 0;
                continue;
            }
            total += prices[idx];
            cnt++;
        }

        System.out.println(total);
    }
}


