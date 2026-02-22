import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] deque = new int[N * 2 + 1];

        int front = N;
        int rear = N;
        int num;

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int commend = Integer.parseInt(st.nextToken());

            switch (commend) {
                case 1:
                    num = Integer.parseInt(st.nextToken());
                    deque[--front] = num;
                    break;
                case 2:
                    num = Integer.parseInt(st.nextToken());
                    deque[rear++] = num;
                    break;
                case 3:
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque[front++]).append("\n");
                    }
                    break;
                case 4:
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque[--rear]).append("\n");
                    }
                    break;
                case 5:
                    sb.append(rear - front).append("\n");
                    break;
                case 6:
                    if (front == rear) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 7:
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque[front]).append("\n");
                    }
                    break;
                case 8:
                    if (front == rear) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deque[rear - 1]).append("\n");
                    }
            }
        }

        System.out.println(sb);
    }
}


