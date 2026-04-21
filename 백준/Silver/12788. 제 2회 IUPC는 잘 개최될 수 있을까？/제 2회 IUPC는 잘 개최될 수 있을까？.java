import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int team = Integer.parseInt(st.nextToken());
        int people = Integer.parseInt(st.nextToken());

        int need = team * people;

        int[] CTP = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            CTP[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(CTP);

        int answer = 0;

        for (int i = N - 1; i >= 0; i--) {
            need -= CTP[i];
            answer++;

            if (need <= 0) break;
        }

        if (need > 0) {
            System.out.println("STRESS");
            return;
        }

        System.out.println(answer);
    }
}

