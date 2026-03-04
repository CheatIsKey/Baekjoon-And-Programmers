import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] people = new int[N];

        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(people);

        long total_tip = 0;
        int sequence = 1;

        for (int i = N - 1; i >= 0; i--) {
            int tip = people[i] - (sequence++ - 1);
            if (tip <= 0) {
                continue;
            }
            total_tip += tip;
        }

        System.out.println(total_tip);
    }
}


