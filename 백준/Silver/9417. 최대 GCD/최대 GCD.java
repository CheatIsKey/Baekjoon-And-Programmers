import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < N; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> list = new ArrayList<>();

            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());

                list.add(num);
            }

            int answer = 0;

            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    int numOne = list.get(i);
                    int numTwo = list.get(j);

                    answer = Math.max(gcd(numOne, numTwo), answer);
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int numOne, int numTwo) {
        if (numTwo == 0) return numOne;
        
        return gcd(numTwo, numOne % numTwo);
    }

}

