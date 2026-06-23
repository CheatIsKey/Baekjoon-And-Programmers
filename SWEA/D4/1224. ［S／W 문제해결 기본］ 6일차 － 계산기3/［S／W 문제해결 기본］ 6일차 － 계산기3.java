import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int length = Integer.parseInt(br.readLine());
            String s = br.readLine();
            StringBuilder calculate = new StringBuilder();

            Stack<Character> notNum = new Stack<>();

            for (int idx = 0; idx < length; idx++) {
                char c = s.charAt(idx);

                if ('0' <= c && c <= '9') {
                    calculate.append(c);
                } else {
                    if (c == '(') {
                        notNum.push(c);
                    } else if (c == ')') {
                        while (!notNum.isEmpty() && notNum.peek() != '(') {
                            calculate.append(notNum.pop());
                        }

                        notNum.pop();
                    } else {
                        if (notNum.isEmpty()) {
                            notNum.push(c);
                            continue;
                        }

                        while (!notNum.isEmpty()
                                && notNum.peek() != '('
                                && priority(c) <= priority(notNum.peek())) {

                            calculate.append(notNum.pop());
                        }

                        notNum.push(c);
                    }
                }
            }
            while (!notNum.isEmpty()) {
                calculate.append(notNum.pop());
            }

            String str = calculate.toString();
            Stack<Integer> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                if ('0' <= c && c <= '9') {
                    stack.push(c - '0');
                } else {
                    Integer num2 = stack.pop();
                    Integer num1 = stack.pop();
                    int cal = (c == '+') ? num1 + num2 : num1 * num2;

                    stack.push(cal);
                }
            }

            sb.append("#").append(tc).append(" ").append(stack.pop()).append("\n");
        }

        System.out.println(sb);
    }

    private static int priority(char c) {
        if (c == '+') {
            return 1;
        }
        return 2;
    }
}