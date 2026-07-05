import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb.append("#").append(i).append(" ");

            int num = Integer.parseInt(br.readLine());

            sb.append(num * num).append('\n');
        }

        System.out.println(sb);
    }
}