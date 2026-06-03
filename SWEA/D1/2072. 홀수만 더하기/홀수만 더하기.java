import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int cnt = 0; cnt < 10; cnt++) {
                int num = Integer.parseInt(st.nextToken());

                if (num % 2 != 0) {
                    sum += num;
                }
            }

            sb.append("#").append(tc).append(" ").append(sum).append("\n");
        }

        System.out.println(sb);
    }
}