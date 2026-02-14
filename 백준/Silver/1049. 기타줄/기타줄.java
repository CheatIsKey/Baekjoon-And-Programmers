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
        int M = Integer.parseInt(st.nextToken());

        int[] minPackage = new int[M];
        int[] minSingle = new int[M];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            minPackage[i] = Integer.parseInt(st.nextToken());
            minSingle[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(minPackage);
        Arrays.sort(minSingle);

        int onlyPackage = (N % 6 == 0) ? ((N / 6) * minPackage[0]) : ((N / 6 + 1) * minPackage[0]);
        int onlySingle = N * minSingle[0];
        int packageAndSingle = ((N / 6) * minPackage[0]) + ((N % 6) * minSingle[0]);

        int amount = Math.min(onlyPackage, Math.min(onlySingle, packageAndSingle));

        System.out.println(amount);
    }
}


