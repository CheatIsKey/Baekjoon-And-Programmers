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

        String[] numbers = new String[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = br.readLine();
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 1; i <= numbers[0].length(); i++) {
            for (int j = 0; j < N; j++) {
                set.add(numbers[j].substring(numbers[0].length() - i));
            }

            if (set.size() == N) {
                System.out.println(i);
                return;
            }

            set.clear();
        }
    }
}


