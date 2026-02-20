import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            long n = Long.parseLong(br.readLine());

            long prime = isPrime(n);

            sb.append(prime).append("\n");
        }

        System.out.println(sb);
    }

    private static long isPrime(long num) {
        if (num == 0 || num == 1) {
            return 2;
        }

        long temp = num;

        while (true) {
            boolean flag = true;

            for (int i = 2; (long) i * i <= temp; i++) {
                if (temp % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return temp;
            }

            temp++;
        }
    }
}


