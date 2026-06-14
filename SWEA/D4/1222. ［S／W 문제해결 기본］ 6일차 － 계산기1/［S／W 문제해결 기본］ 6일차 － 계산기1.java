import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        for (int tc = 1; tc <= 10; tc++) {
            int length = Integer.parseInt(br.readLine());
            String s = br.readLine();

            StringBuilder postfix = new StringBuilder();
            Stack<Character> oper = new Stack<>();

            for (int idx = 0; idx < length; idx++) {
                char c = s.charAt(idx);

                if ('0' <= c && c <= '9') {
                    postfix.append(c);
                } else {
                    while (!oper.isEmpty()) {
                        postfix.append(oper.pop());
                    }
                    oper.push(c);
                }
            }

            while (!oper.isEmpty()) {
                postfix.append(oper.pop());
            }

            Stack<Integer> numbers = new Stack<>();

            for (int idx = 0; idx < postfix.length(); idx++) {
                char c = postfix.charAt(idx);

                if ('0' <= c && c <= '9') {
                    numbers.push(c - '0');
                } else {
                    int num2 = numbers.pop();
                    int num1 = numbers.pop();

                    numbers.push(num1 + num2);
                }
            }

            answer.append('#').append(tc).append(" ").append(numbers.pop()).append('\n');
        }

        System.out.println(answer);
    }
}