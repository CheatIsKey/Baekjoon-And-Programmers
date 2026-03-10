import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[] light;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        light = new int[M];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            light[i] = Integer.parseInt(st.nextToken());
        }

        int left = 1;
        int right = N;
        int result = N;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isAllBright(mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean isAllBright(int height) {
        if (light[0] - height > 0) {
            return false;
        }

        for (int i = 1; i < M; i++) {
            if (light[i] - light[i - 1] > 2 * height) {
                return false;
            }
        }

        if (light[M - 1] + height < N) {
            return false;
        }

        return true;
    }
}


