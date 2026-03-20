import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long totalSum = 0;
        long answer = 0;

        int[] numbers = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            numbers[i] = num;
            totalSum += num;
        }

        for (int i = 0; i < N; i++) {
            totalSum -= numbers[i];
            answer += totalSum * numbers[i];
        }

        System.out.println(answer);
    }
}


