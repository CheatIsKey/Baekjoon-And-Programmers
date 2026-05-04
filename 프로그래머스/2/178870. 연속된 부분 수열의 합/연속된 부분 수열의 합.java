class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int length = Integer.MAX_VALUE;
        int total = 0;
        int start = 0;
        int end = 0;

        while (end < sequence.length) {
            total += sequence[end];

            while (total > k && start <= end) {
                total -= sequence[start];
                start++;
            }

            if (total == k) {
                int curLength = end - start + 1;

                if (curLength < length) {
                    length = curLength;
                    answer[0] = start;
                    answer[1] = end;
                }
            }

            end++;
        }

        return answer;
    }
}