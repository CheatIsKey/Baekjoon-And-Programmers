import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] candies = new int[N];
        int totalCandies = 0;

        for (int i = 0; i < N; i++) {
            int candy = Integer.parseInt(br.readLine());
            candies[i] = candy;
            totalCandies += candy;
        }

        totalCandies /= 2;

        for (int i = 1; i < candies.length; i += 2) {
            totalCandies -= candies[i];
        }

        int student = totalCandies;

        sb.append(student).append("\n");

        for (int i = 0; i < candies.length - 1; i++) {
            int sub = candies[i] - student;
            sb.append(sub).append('\n');
            student = sub;
        }

        System.out.println(sb);
    }
}

