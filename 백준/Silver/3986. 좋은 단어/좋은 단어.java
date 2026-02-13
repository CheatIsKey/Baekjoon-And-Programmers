import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Character> deque = new ArrayDeque<>();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();

            if (word.length() % 2 != 0) continue;

            for (int j = 0; j < word.length(); j++) {
                char c1 = word.charAt(j);

                if (!deque.isEmpty() && deque.peek() == c1) {
                    deque.pop();
                } else {
                    deque.push(c1);
                }
            }

            if (deque.isEmpty()){
                cnt++;
            }

            deque.clear();
        }

        System.out.println(cnt);
    }
}


