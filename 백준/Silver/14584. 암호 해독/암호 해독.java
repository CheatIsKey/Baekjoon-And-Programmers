import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] encoded = br.readLine().toCharArray();

        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 0; i < 26; i++) {
            for (char c : encoded) {
                sb.append((char) ((c - 'a' + i) % 26 + 'a'));
            }

            String decoded = sb.toString();

            for (String word : set) {
                if (decoded.contains(word)) {
                    System.out.println(decoded);
                    return;
                }
            }

            sb.setLength(0);
        }
    }
}

