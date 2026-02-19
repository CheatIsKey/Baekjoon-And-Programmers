import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        long[] numbers = new long[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(numbers);

        long[] maxNumber = new long[2];

        long cnt = 1;
        long prev = numbers[0];
        maxNumber[0] = cnt;
        maxNumber[1] = prev;

        for (int i = 1; i < N; i++) {
            if (numbers[i] == prev) {
                cnt++;
            } else {
                long count = maxNumber[0];

                if (cnt > count) {
                    maxNumber[0] = cnt;
                    maxNumber[1] = prev;
                }

                cnt = 1;
                prev = numbers[i];
            }
        }

        long count = maxNumber[0];

        if (cnt > count) {
            maxNumber[0] = cnt;
            maxNumber[1] = prev;
        }

        System.out.println(maxNumber[1]);
    }
}


