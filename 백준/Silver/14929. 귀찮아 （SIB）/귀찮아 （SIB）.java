import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];

        long totalSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            numbers[i] = x;
            totalSum += x;
        }

        long answer = 0;
        for (int i = 0; i < n; i++) {
            int x = numbers[i];
            totalSum -= x;
            answer += x * totalSum;
        }

        System.out.println(answer);
    }
}

