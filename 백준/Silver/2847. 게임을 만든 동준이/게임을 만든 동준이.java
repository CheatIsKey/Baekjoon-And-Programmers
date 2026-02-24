import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] levels = new int[N];

        for (int i = 0; i < N; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        int total = 0;
        for (int i = N - 1; i > 0; i--) {
            if (levels[i - 1] >= levels[i]) {
                int decrease =  levels[i - 1] - (levels[i] - 1);
                total += decrease;
                levels[i - 1] = levels[i] - 1;
            }
        }

        System.out.println(total);
    }
}


