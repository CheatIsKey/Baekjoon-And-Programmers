import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int mainRing = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N - 1; i++) {
            int ring = Integer.parseInt(st.nextToken());

            int value = gcd(mainRing, ring);

            sb.append((mainRing / value)).append('/').append((ring / value)).append('\n');
        }

        System.out.println(sb);
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return gcd(num2, num1 % num2);
    }
}


