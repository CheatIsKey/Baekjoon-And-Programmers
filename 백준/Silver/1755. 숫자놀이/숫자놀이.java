import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        String[] english = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        List<Node> list = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            String s = String.valueOf(i);
            sb.setLength(0);

            for (int j = 0; j < s.length(); j++) {
                sb.append(english[s.charAt(j) - '0']).append(" ");
            }

            list.add(new Node(sb.toString().trim(), i));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).num + " ");
            if ((i + 1) % 10 == 0) System.out.println();
        }
    }

    private static class Node implements Comparable<Node> {
        String eng;
        int num;

        Node(String eng, int num) {
            this.eng = eng;
            this.num = num;
        }

        @Override
        public int compareTo(Node o) {
            return this.eng.compareTo(o.eng);
        }
    }
}


