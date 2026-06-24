import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        sb.append(1).append(" ");

        for (int idx = 2; idx <= N; idx++) {
            if (N % idx == 0) {
                sb.append(idx).append(" ");
            }
        }

        System.out.println(sb);
    }
}