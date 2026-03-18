import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] customers = new int[M];

        for (int i = 0; i < M; i++) {
            customers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(customers);

        int profit = 0;
        int money = 0;

        for (int i = 0; i < M; i++) {
            int price = customers[i];
            int count = M - i;

            int available = Math.min(N, count);
            int totalProfit = available * price;

            if (totalProfit > profit) {
                profit = totalProfit;
                money = price;
            }
        }

        System.out.println(money + " " + profit);
    }
}


