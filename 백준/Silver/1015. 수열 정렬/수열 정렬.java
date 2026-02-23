import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<int[]> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            list.add(new int[]{i, num});
        }

        list.sort((a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            int idx = list.get(i)[0];
            numbers[idx] = i;
        }

        for (int number : numbers) {
            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }
}


