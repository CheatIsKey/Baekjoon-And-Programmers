import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());

        int[] dp = new int[X + 1];
        dp[0] = 0;

        for (int i = 2; i <= X; i++) {
            int divideTwo = Integer.MAX_VALUE;
            int divideThree = Integer.MAX_VALUE;
            int minusOne = Integer.MAX_VALUE;

            if (i % 2 == 0) {
                divideTwo = dp[i / 2] + 1;
            }
            if (i % 3 == 0) {
                divideThree = dp[i / 3] + 1;
            }
            if (i - 1 >= 1){
                minusOne = dp[i - 1] + 1;
            }

            dp[i] = Math.min(divideTwo, Math.min(divideThree, minusOne));
        }

        System.out.println(dp[X]);
    }
}