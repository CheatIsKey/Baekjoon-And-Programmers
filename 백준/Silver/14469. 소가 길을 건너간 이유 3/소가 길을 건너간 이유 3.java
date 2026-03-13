import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Cow> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int arrive = Integer.parseInt(st.nextToken());
            int validate = Integer.parseInt(st.nextToken());

            list.add(new Cow(arrive, validate));
        }

        list.sort((a, b) -> {
            return Integer.compare(a.arrive, b.arrive);
        });

        int currentTime = 0;

        for (Cow cow : list) {
            if (cow.arrive > currentTime) {
                currentTime = cow.arrive;
                currentTime += cow.validate;
            } else {
                currentTime += cow.validate;
            }
        }

        System.out.println(currentTime);
    }

    private static class Cow {
        private final int arrive;
        private final int validate;

        public Cow(int arrive, int validate) {
            this.arrive = arrive;
            this.validate = validate;
        }
    }
}


