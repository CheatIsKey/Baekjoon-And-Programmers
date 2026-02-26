import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        map.put(A, 0);

        int answer = recursion(A, P, 1);

        System.out.println(answer);
    }

    private static int recursion(int number, int P, int idx) {
        int result = 0;

        while (number > 0) {
            result += (int) Math.pow(number % 10, P);
            number /= 10;
        }

        if (map.containsKey(result)) {
            return map.get(result);
        }

        map.put(result, idx);
        return recursion(result, P, idx + 1);
    }
}


