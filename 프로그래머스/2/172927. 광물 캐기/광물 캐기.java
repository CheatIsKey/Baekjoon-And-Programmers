class Solution {
    public int solution(int[] picks, String[] minerals) {
        return recursion(0, 0, picks, minerals);
    }

    private int recursion(int mineralIdx, int tired, int[] picks, String[] minerals) {
        if (picks[0] == 0 && picks[1] == 0 && picks[2] == 0 || mineralIdx > minerals.length - 1) {
            return tired;
        }

        int idx = Math.min(mineralIdx + 5, minerals.length);
        int score = Integer.MAX_VALUE;

        if (picks[0] != 0) {
            int cost = 0;
            picks[0]--;

            for (int i = mineralIdx; i < idx; i++) {
                String mineral = minerals[i];

                switch (mineral) {
                    case "diamond":
                        cost++;
                        break;
                    case "iron":
                        cost++;
                        break;
                    case "stone":
                        cost++;
                        break;
                }
            }
            score = Math.min(score, recursion(mineralIdx + 5, tired + cost, picks, minerals));
            picks[0]++;
        }

        if (picks[1] != 0) {
            int cost = 0;
            picks[1]--;

            for (int i = mineralIdx; i < idx; i++) {
                String mineral = minerals[i];

                switch (mineral) {
                    case "diamond":
                        cost += 5;
                        break;
                    case "iron":
                        cost++;
                        break;
                    case "stone":
                        cost++;
                        break;
                }
            }
            score = Math.min(score, recursion(mineralIdx + 5, tired + cost, picks, minerals));
            picks[1]++;
        }

        if (picks[2] != 0) {
            int cost = 0;
            picks[2]--;

            for (int i = mineralIdx; i < idx; i++) {
                String mineral = minerals[i];

                switch (mineral) {
                    case "diamond":
                        cost += 25;
                        break;
                    case "iron":
                        cost += 5;
                        break;
                    case "stone":
                        cost++;
                        break;
                }
            }
            score = Math.min(score, recursion(mineralIdx + 5, tired + cost, picks, minerals));
            picks[2]++;
        }

        return score;
    }
}