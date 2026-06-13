import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int length = Integer.parseInt(br.readLine());
            String s = br.readLine();

            Stack<Character> stack = new Stack<>();
            StringBuilder calculate = new StringBuilder(); 
            answer.append('#').append(tc).append(" ");

            for (int idx = 0; idx < length; idx++) {
                char c = s.charAt(idx);

                if ('0' <= c && c <= '9') {
                    calculate.append(c);
                } else {
                    while (!stack.isEmpty() && getPriority(stack.peek()) >= getPriority(c)) {
                        calculate.append(stack.pop());
                    }
                    stack.push(c);
                }
            }

            while (!stack.isEmpty()) {
                calculate.append(stack.pop());
            }

            String postfix = calculate.toString();
            Stack<Integer> numbers = new Stack<>();

            for (int idx = 0; idx < postfix.length(); idx++) { 
                char c = postfix.charAt(idx);

                if ('0' <= c && c <= '9') {
                    numbers.push(c - '0');
                } else {
                    int num2 = numbers.pop(); 
                    int num1 = numbers.pop();

                    switch (c) {
                        case '+':
                            numbers.push(num1 + num2);
                            break;
                        case '*':
                            numbers.push(num1 * num2);
                            break;
                    }
                }
            }

            answer.append(numbers.pop()).append('\n');
        }

        System.out.println(answer);
    }

    private static int getPriority(char oper) {
        return oper == '+' ? 1 : 2;
    }
}