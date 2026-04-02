import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(br.readLine());

            sb.append(binarySearch(numbers, target)).append("\n");
        }

        System.out.println(sb);
    }

    private static int binarySearch(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (numbers[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}

