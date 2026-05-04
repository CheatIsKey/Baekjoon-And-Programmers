import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();
        List<Plan> planList = new ArrayList<>();
        Stack<Plan> stack = new Stack<>();

        for (String[] plan : plans) {
            planList.add(new Plan(plan[0], plan[1], plan[2]));
        }

        planList.sort((a, b) -> a.start - b.start);

        for (int i = 0; i < planList.size() - 1; i++) {
            Plan current = planList.get(i);
            Plan next = planList.get(i + 1);

            int sub = next.start - current.start;

            if (sub == current.playtime) {
                answer.add(current.name);
            } else if (sub < current.playtime) {
                current.playtime -= sub;
                stack.push(current);
            } else {
                answer.add(current.name);
                int gap = sub - current.playtime;

                while (!stack.isEmpty() && gap > 0) {
                    Plan paused = stack.peek();

                    if (paused.playtime <= gap) {
                        gap -= paused.playtime;
                        answer.add(stack.pop().name);
                    } else {
                        paused.playtime -= gap;
                        gap = 0;
                    }
                }
            }
        }

        answer.add(planList.get(planList.size() - 1).name);

        while (!stack.isEmpty()) {
            answer.add(stack.pop().name);
        }

        return answer.toArray(new String[0]);
    }

    static class Plan {
        String name;
        int start;
        int playtime;

        public Plan(String name, String start, String playtime) {
            this.name = name;
            this.start = convertTime(start);
            this.playtime = Integer.parseInt(playtime);
        }

        private int convertTime(String time) {
            String[] split = time.split(":");
            return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
        }
    }
}