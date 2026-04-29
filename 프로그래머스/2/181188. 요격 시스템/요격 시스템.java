import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, (a, b) -> {
            return Integer.compare(a[1], b[1]);
        });

        int count = 0;
        int last_pos = -1;

        for (int[] target : targets) {
            if (last_pos <= target[0]) {
                count++;
                last_pos = target[1];
            }
        }

        return count;
    }
}