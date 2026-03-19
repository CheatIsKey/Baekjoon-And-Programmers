import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>(N);

        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == -1) break;

            if (input == 0) {
                if (!queue.isEmpty()) {
                    queue.pollFirst();
                }
            } else {
                if (queue.size() < N) {
                    queue.addLast(input);
                }
            }
        }

        if (queue.isEmpty()) {
            System.out.println("empty");
            return;
        }

        for (int num : queue) {
            sb.append(num).append(" ");
        }

        System.out.println(sb);
    }
}


