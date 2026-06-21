import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                if (r == c) {
                    sb.append("#");
                } else {
                    sb.append("+");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}