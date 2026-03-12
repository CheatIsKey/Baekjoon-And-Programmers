import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }
        
        if (N == 1) {
            System.out.println(1);
            return;
        }

        long[] fibo = new long[N + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= N; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000007;
        }

        System.out.println(fibo[N]);
    }
}


