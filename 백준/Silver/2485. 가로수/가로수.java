import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] trees = new int[N];
        int[] distances = new int[N - 1];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
            if (i != 0) distances[i - 1] = trees[i] - trees[i - 1];
        }

        int gcd_val = distances[0];

        for (int i = 1; i < distances.length; i++) {
            gcd_val = gcd(gcd_val, distances[i]);
        }

        int result = (trees[N - 1] - trees[0]) / gcd_val + 1 - N;

        System.out.println(result);
    }

    private static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}


