import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] numbers = new int[N];
        int[] needs = new int[5];

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            numbers[i] = number;
        }

        Arrays.sort(numbers);

        int maxCount = 0;

        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = i; j < N; j++) {
                if (numbers[j] <= numbers[i] + 4) {
                    count++;
                } else {
                    break;
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.println(5 - maxCount);
    }
}



