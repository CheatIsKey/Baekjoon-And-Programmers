import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, K, answer;
    static List<House> houses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        houses = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            houses.add(new House(x, y));
        }

        int[] shelter = new int[K];
        answer = Integer.MAX_VALUE;

        combine(0, 0, shelter);

        System.out.println(answer);
    }

    private static void combine(int start, int count, int[] shelter) {
        if (count == K) {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int min = Integer.MAX_VALUE;

                for (int j = 0; j < K; j++) {
                    int shelterIdx = shelter[j];
                    int dist = dist(houses.get(i), houses.get(shelterIdx));
                    min = Math.min(min, dist);
                }

                max = Math.max(max, min);
            }

            answer = Math.min(answer, max);
            return;
        }

        for (int i = start; i < N; i++) {
            shelter[count] = i;
            combine(i + 1, count + 1, shelter);
        }
    }

    private static int dist(House houseOne, House houseTwo) {
        return Math.abs(houseOne.x - houseTwo.x) + Math.abs(houseOne.y - houseTwo.y);
    }

    private static class House {
        private final int x;
        private final int y;

        public House(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

