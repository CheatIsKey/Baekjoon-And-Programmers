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

        int total = 0;
        int temp = 9;
        int prev = 0;
        int digitSlice = 1;

        while (true) {
            if (N <= temp) {
                total += (N - prev) * digitSlice;
                break;
            }

            total += (temp - prev) * digitSlice;
            digitSlice++;

            prev = temp;
            temp = temp * 10 + 9;
        }

        System.out.println(total);
    }
}


