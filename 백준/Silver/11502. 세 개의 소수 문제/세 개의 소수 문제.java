import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[1001];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int t = 0; t < T; t++) {
            int K = Integer.parseInt(br.readLine());

            if (K <= 5) {
                sb.append(0).append('\n');
                continue;
            }

            boolean flag = false;

            for (int i = 2; i < K; i++) {
                if (isPrime[i]) {
                    for (int j = i; j < K; j++) {
                        if (isPrime[j]) {
                            for (int k = j; k < K; k++) {
                                if (isPrime[k]) {
                                    if (i + j + k == K) {
                                        sb.append(i).append(" ").append(j).append(" ").append(k).append('\n');
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (flag) break;
                    }
                }
                if (flag) break;
            }
        }

        System.out.println(sb);
    }
}

