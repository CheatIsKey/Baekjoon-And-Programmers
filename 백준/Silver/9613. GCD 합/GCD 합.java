import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n =  Integer.parseInt(st.nextToken());

            int[] numbers = new int[n];
            long total = 0;

            for (int j = 0; j < n; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }

            for (int r = 0; r < n - 1; r++) {
                for (int c = r + 1; c < n; c++) {
                    total += gcd(numbers[r], numbers[c]);
                }
            }
            
            sb.append(total).append("\n");
        }
        
        System.out.println(sb);
    }

    private static long gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}


