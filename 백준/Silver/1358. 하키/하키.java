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

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int radius = H / 2;
        int answer = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if ((X <= x && x <= X + W) && (Y <= y && y <= Y + H)) {
                answer++;
                continue;
            }

            if (Math.pow(X - x, 2) + Math.pow(Y + radius - y, 2) <= Math.pow(radius, 2)) {
                answer++;
                continue;
            }

            if (Math.pow(X + W - x, 2) + Math.pow(Y + radius - y, 2) <= Math.pow(radius, 2)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}


