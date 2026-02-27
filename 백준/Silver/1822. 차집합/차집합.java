import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Long> A = new TreeSet<>();
        Set<Long> B = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A.add(Long.parseLong(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B.add(Long.parseLong(st.nextToken()));
        }

        A.removeAll(B);
        sb.append(A.size()).append("\n");

        for (Long number : A) {
            sb.append(number).append(" ");
        }

        System.out.println(sb);
    }
}


